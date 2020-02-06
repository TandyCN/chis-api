package pers.tandy.chis.modules.goodsitemmanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.ApproveStateEnum;
import pers.tandy.chis.main.component.DateUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.goodsitemmanagement.bean.Goods;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsAdjustPrice;
import pers.tandy.chis.modules.goodsitemmanagement.dao.GoodsAdjustPriceMapper;
import pers.tandy.chis.modules.goodsitemmanagement.service.GoodsAdjustPriceService;
import pers.tandy.chis.modules.goodsitemmanagement.service.GoodsService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/8/22 10:32
 * @Version 1.0
 */
@Service
public class GoodsAdjustPriceServiceImpl implements GoodsAdjustPriceService {

    private GoodsAdjustPriceMapper goodsAdjustPriceMapper;
    @Autowired
    public void setGoodsAdjustPriceMapper(GoodsAdjustPriceMapper goodsAdjustPriceMapper) {
        this.goodsAdjustPriceMapper = goodsAdjustPriceMapper;
    }

    private GoodsService goodsService;
    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @Override
    public void save(List<GoodsAdjustPrice> goodsAdjustPriceList) {
        // 获取创建人信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        // 获取流水号
        String lsh = KeyUtils.getLSH(user.getId());
        // 初始化明细号
        int mxh = 1;

        // 赋值流水号 明细号 单据状态 创建人 创建日期 失效日期
        for (GoodsAdjustPrice gap : goodsAdjustPriceList) {
            gap.setLsh(lsh);
            gap.setMxh(String.valueOf(mxh++));
            gap.setApproveState(ApproveStateEnum.PENDING.getIndex());
            gap.setCreatorId(user.getId());
            gap.setCreationDate(new Date());
            gap.setExpiryDate(DateUtils.getFutureDate(1));
        }
        goodsAdjustPriceMapper.insertList(goodsAdjustPriceList);
    }

    @Override
    public void cancel(String lsh) {
        List<GoodsAdjustPrice> goodsAdjustPriceList = this.parseMapToList(this.getByLsh(lsh));
        if (!this.examineApproveState(goodsAdjustPriceList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据需为待审批状态");
        }

        // 检查单据是否过期
        if (!this.examineCreationDate(goodsAdjustPriceList)) {
            throw new RuntimeException("调价单已过期");
        }

        goodsAdjustPriceMapper.updateByLsh(lsh, null, null, ApproveStateEnum.CANCEL.getIndex());
    }

    @Override
    public void unapproved(String lsh) {
        List<GoodsAdjustPrice> goodsAdjustPriceList = this.parseMapToList(this.getByLsh(lsh));
        if (!this.examineApproveState(goodsAdjustPriceList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据需为待审批状态");
        }

        // 检查单据是否过期
        if (!this.examineCreationDate(goodsAdjustPriceList)) {
            throw new RuntimeException("调价单已过期");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        goodsAdjustPriceMapper.updateByLsh(lsh, user.getId(), new Date(), ApproveStateEnum.UNAPPROVED.getIndex());
    }

    @Override
    public void approved(String lsh) {
        List<GoodsAdjustPrice> goodsAdjustPriceList = this.parseMapToList(this.getByLsh(lsh));
        if (!this.examineApproveState(goodsAdjustPriceList, ApproveStateEnum.PENDING.getIndex())) {
            throw new RuntimeException("操作未被允许, 单据需为待审批状态");
        }

        // 检查单据是否过期
        if (!this.examineCreationDate(goodsAdjustPriceList)) {
            throw new RuntimeException("调价单已过期");
        }

        // 修改调价单状态
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        goodsAdjustPriceMapper.updateByLsh(lsh, user.getId(), new Date(), ApproveStateEnum.APPROVED.getIndex());

        // 进行调价
        List<Goods> goodsList = new ArrayList<>();
        for (GoodsAdjustPrice gap : goodsAdjustPriceList) {
            Goods goods = new Goods();
            goods.setId(gap.getGsmGoodsId());
            goods.setRetailPrice(gap.getNewRetailPrice());
            goods.setSplitPrice(gap.getNewSplitPrice());
            goodsList.add(goods);
        }
        goodsService.updateRetailPriceByList(goodsList);

        // 因为是批量更新 所以要清除缓存 使其价格立即生效
        for (Goods goods : goodsList) {
            goodsService.cacheEvictById(goods.getId());
        }
    }

    @Override
    public List<Map<String, Object>> getByLsh(String lsh) {
        return goodsAdjustPriceMapper.selectByLsh(lsh);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(String[] creationDate, String name, Byte approveState) {
        return goodsAdjustPriceMapper.selectByCriteria(creationDate, name, approveState);
    }

    @Override
    public List<Map<String, Object>> getGroupListByCriteria(String[] creationDate, String lsh, Byte approveState) {
        return goodsAdjustPriceMapper.selectGroupListByCriteria(creationDate, lsh, approveState);
    }
}
