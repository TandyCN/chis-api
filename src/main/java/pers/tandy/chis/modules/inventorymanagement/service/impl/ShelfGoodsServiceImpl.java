package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfGoods;
import pers.tandy.chis.modules.inventorymanagement.dao.ShelfGoodsMapper;
import pers.tandy.chis.modules.inventorymanagement.service.ShelfGoodsService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/1/5 15:28
 * @Version 1.0
 */
@Service
public class ShelfGoodsServiceImpl implements ShelfGoodsService {

    private ShelfGoodsMapper shelfGoodsMapper;
    @Autowired
    public void setShelfGoodsMapper(ShelfGoodsMapper shelfGoodsMapper) {
        this.shelfGoodsMapper = shelfGoodsMapper;
    }

    /* -------------------------------------------------------------------------------------------------------------- */
    @Override
    public void saveOrUpdateList(List<ShelfGoods> shelfGoodsList) {
        List<ShelfGoods> saveList = new ArrayList<>();
        List<ShelfGoods> updateList = new ArrayList<>();

        for (ShelfGoods shelfGoods : shelfGoodsList) {
            if (shelfGoods.getId() == null) {
                saveList.add(shelfGoods);
            } else {
                updateList.add(shelfGoods);
            }
        }

        if (!saveList.isEmpty()) {
            this.saveList(saveList);
        }

        if (!updateList.isEmpty()) {
            this.updateList(updateList);
        }
    }

    @Override
    public void saveList(List<ShelfGoods> shelfGoodsList) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();  // 获取用户信息
        for (ShelfGoods shelfGoods : shelfGoodsList) {
            shelfGoods.setSysClinicId(user.getSysClinicId());
        }
        this.shelfGoodsMapper.saveList(shelfGoodsList);
    }

    @Override
    public void updateList(List<ShelfGoods> shelfGoodsList) {
        this.shelfGoodsMapper.updateList(shelfGoodsList);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(Integer sysClinicId,
                                                             Integer gsmGoodsTypeId,
                                                             String gsmGoodsName,
                                                             String iymShelfPositionName) {
        return shelfGoodsMapper.selectClinicListByCriteria(sysClinicId, gsmGoodsTypeId, gsmGoodsName, iymShelfPositionName);
    }


}
