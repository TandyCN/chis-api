package pers.tandy.chis.modules.inventorymanagement.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.component.DecimalUtils;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.modules.goodsitemmanagement.bean.Goods;
import pers.tandy.chis.modules.goodsitemmanagement.service.GoodsService;
import pers.tandy.chis.modules.inventorymanagement.bean.Inventory;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryExample;
import pers.tandy.chis.modules.inventorymanagement.dao.InventoryMapper;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryService;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/9/29 16:24
 * @Version 1.0
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    private InventoryMapper inventoryMapper;
    @Autowired
    public void setInventoryMapper(InventoryMapper inventoryMapper) {
        this.inventoryMapper = inventoryMapper;
    }

    private GoodsService goodsService;
    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(List<Inventory> inventoryList) {
        // 获取对应商品最后一次平均进价记录
        Map<Integer, Float> lacpMap = this.getLastAverageCostPrice(inventoryList);
        // 计算本次库存的平均成本价
        for (Inventory inventory : inventoryList) {
            float averageCostPrice = this.computeAverageCostPrice(lacpMap, inventory.getGsmGoodsId(), inventory.getCostPrice());
            inventory.setAverageCostPrice(averageCostPrice); // 批次平均成本价
        }
        // 提交数据
        inventoryMapper.insertList(inventoryList);
    }

    private Map<Integer, Float> getLastAverageCostPrice(List<Inventory> inventoryList) {
        // 获取商品ID
        List<Integer> goodsIdList = new ArrayList<>();
        for (Inventory inventory : inventoryList) {
            goodsIdList.add(inventory.getGsmGoodsId());
        }
        // 查询并返回最后一次记录
        List<Inventory> lastInventoryList = this.getLastByGoodsIdList(goodsIdList);

        // 将记录以 Map 的方式返回
        Map<Integer, Float> inventoryMap = new HashMap<>();
        for (Inventory inventory : lastInventoryList) {
            inventoryMap.put(inventory.getGsmGoodsId(), inventory.getAverageCostPrice());
        }

        return inventoryMap;
    }

    private Float computeAverageCostPrice(Map<Integer, Float> lastAverageCostPriceMap, Integer goodsId, Float costPrice) {
        if (lastAverageCostPriceMap == null || goodsId == null || costPrice == null) {
            throw new RuntimeException("计算平均成本价时不能有空参数");
        }

        Float lacp = lastAverageCostPriceMap.get(goodsId);
        if (lacp == null) {
            return costPrice;
        } else {
            float acp = (lacp + costPrice) / 2;
            return DecimalUtils.roundHalfUp(acp, 4);
        }
    }

    @Override
    public void updateQuantityByList(List<Inventory> inventoryList) {
        /*
        * 2020-01-12 23:30 放弃使用注释的操作
        * 由于使用了事务, 所有数据均在最后一次性提交,
        * 所以使用 for 循环单个 update 和使用 mapper 一次执行多个 update 性能相同
        * 200条数据用时13秒, 100条数据用时5.5秒, 50条数据用时3.5秒
        * 改用循环操作, 方便提示库存不足的商品信息, 数据最好控制在 50条以内
        **/

        /*
        try {
            inventoryMapper.updateQuantityByList(inventoryList);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("库存数量不足");
        }
        */

        for (Inventory inventory : inventoryList) {
            try {
                inventoryMapper.updateQuantityById(inventory.getId(), inventory.getQuantity());
            } catch (DataIntegrityViolationException e) {
                throw new RuntimeException("商品编码:【" + inventory.getGsmGoodsOid() + "】" +
                        " 商品名称:【" + inventory.getGsmGoodsName() + "】" +
                        " 批号:【" + inventory.getPh() + "】" +
                        " 批次号:【" + inventory.getPch() + "】" +
                        " 库存数量不足");
            }
        }


    }

    @Override
    public void updateIymInventoryTypeIdByIdList(List<Integer> idList, Integer iymInventoryTypeId) {
        this.inventoryMapper.updateIymInventoryTypeIdByIdList(idList, iymInventoryTypeId);
    }

    @Override
    public void splitQuantity(Integer id) {
        // 根据 ID 获取对应的库存信息
        Inventory inventory = inventoryMapper.selectByPrimaryKey(id);
        // 获取该库存的商品信息
        Goods goods = goodsService.getById(inventory.getGsmGoodsId());

        // 判断该商品是否可拆零
        if (!goods.getSplitable()) {
            throw new RuntimeException("该商品禁止拆零");
        }

        // 判断拆零数量是否大于 1
        if (goods.getSplitQuantity() <= 1) {
            throw new RuntimeException("该商品拆零数量必须大于1");
        }

        // 判断该库存是否为拆零库存
        if (inventory.getSplitQuantity() > 1) {
            throw new RuntimeException("该记录已被拆零, 不能重复操作");
        }

        // 判断库存是否足够
        if (inventory.getSplitQuantity() <= 0) {
            throw new RuntimeException("库存可用拆零数量不足1");
        }

        // 拆零操作
        List<Inventory> inventoryList = new ArrayList<>();

        float costPrice = inventory.getCostPrice();
        int splitQuantity = goods.getSplitQuantity();
        float averageSplitCostPrice = costPrice / splitQuantity;
        averageSplitCostPrice = DecimalUtils.roundHalfUp(averageSplitCostPrice, 4);
        float lastOneSplitCostPrice = costPrice - averageSplitCostPrice * (splitQuantity - 1);
        lastOneSplitCostPrice = DecimalUtils.roundHalfUp(lastOneSplitCostPrice, 4);

        // 创建一条拆零记录
        Inventory splitInventory = new Inventory();
        BeanUtils.copyProperties(inventory, splitInventory);
        splitInventory.setId(null);
        splitInventory.setSplitQuantity(splitQuantity);
        splitInventory.setQuantity((short) splitQuantity);
        splitInventory.setCostPrice(averageSplitCostPrice);

        // 如果拆零后的进价无法除尽, 则再创建一条库存记录
        if (lastOneSplitCostPrice != averageSplitCostPrice) {
            // 先将第一个拆零库存记录的数量减 1
            splitInventory.setQuantity((short)(splitQuantity - 1));
            // 再创建一个拆零库存记录 使其库存数量为 1, 进价为 lastOneSplitCostPrice
            Inventory lastOneSplitInventory = new Inventory();
            BeanUtils.copyProperties(inventory, lastOneSplitInventory);
            lastOneSplitInventory.setId(null);
            lastOneSplitInventory.setSplitQuantity(splitQuantity);
            lastOneSplitInventory.setQuantity((short) 1);
            lastOneSplitInventory.setCostPrice(lastOneSplitCostPrice);
            inventoryList.add(lastOneSplitInventory);
        }
        inventoryList.add(splitInventory);

        // 提交拆分库存
        inventoryMapper.insertList(inventoryList);

        // 将拆分之前的库存数量减 1
        inventory.setQuantity((short) 1);
        List<Inventory> subtractInventoryList = new ArrayList<>();
        subtractInventoryList.add(inventory);
        inventoryMapper.updateQuantityByList(subtractInventoryList);

    }

    @Override
    public List<Inventory> getLastByGoodsIdList(List<Integer> goodsIdList) {
        return inventoryMapper.selectLastByGoodsIdList(goodsIdList);
    }

    @Override
    public List<Map<String, Object>> getClinicPchEnabledLikeByCriteria(Integer sysClinicId, Integer iymInventoryTypeId, String gsmGoodsName) {
        return inventoryMapper.selectClinicPchEnabledLikeByCriteria(sysClinicId, iymInventoryTypeId, gsmGoodsName);
    }

    @Override
    public List<Map<String, Object>> getClinicPchEnabledByCriteriaForOutInventory(Integer sysClinicId, Integer gsmGoodsId) {
        return inventoryMapper.selectClinicPchEnabledByCriteriaForOutInventory(sysClinicId, gsmGoodsId);
    }


    @Override
    public List<Map<String, Object>> getClinicSubtractPchLikeByCriteria(Integer sysClinicId, Integer iymInventoryTypeId, Integer pemSupplierId, String gsmGoodsName) {
        return inventoryMapper.selectClinicSubtractPchLikeByCriteria(sysClinicId, iymInventoryTypeId, pemSupplierId, gsmGoodsName);
    }

    @Override
    public List<Inventory> getByIdList(List<Integer> idList) {
        List<Map<String, Object>> list = inventoryMapper.selectByIdList(idList);
        String inventoryJson = JSONUtils.parseObjectToJson(list);
        return JSONUtils.parseJsonToObject(inventoryJson, new TypeReference<List<Inventory>>() {});
    }

    @Override
    public List<Map<String, Object>> getClinicPhGroupListByCriteria(Integer sysClinicId, Integer iymInventoryTypeId, Boolean showZero, String gsmGoodsName, String ph) {
        return inventoryMapper.selectPhGroupListByCriteria(sysClinicId, iymInventoryTypeId, showZero, null, gsmGoodsName, ph);
    }

    @Override
    public List<Map<String, Object>> getPhGroupListByCriteria(Boolean showZero, String sysClinicName, String gsmGoodsName, String ph) {
        return inventoryMapper.selectPhGroupListByCriteria(null, null, showZero, sysClinicName, gsmGoodsName, ph);
    }

    @Override
    public List<Map<String, Object>> getClinicPchListByCriteria(Integer sysClinicId, Integer iymInventoryTypeId, Boolean showZero, String gsmGoodsName, String ph) {
        return inventoryMapper.selectClinicPchListByCriteria(sysClinicId, iymInventoryTypeId, showZero, gsmGoodsName, ph);
    }

}
