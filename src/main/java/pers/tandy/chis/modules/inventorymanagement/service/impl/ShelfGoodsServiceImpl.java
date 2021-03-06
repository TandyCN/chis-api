package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
import java.util.stream.Collectors;

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

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /* -------------------------------------------------------------------------------------------------------------- */
    @Override
    public void saveOrUpdateList(List<ShelfGoods> shelfGoodsList) {
        List<ShelfGoods> saveList = shelfGoodsList.stream().filter(shelfGoods -> shelfGoods.getId() == null).collect(Collectors.toList());
        List<ShelfGoods> updateList = shelfGoodsList.stream().filter(shelfGoods -> shelfGoods.getId() != null).collect(Collectors.toList());
        
        User user = (User) SecurityUtils.getSubject().getPrincipal();  // 获取用户信息
        SqlSession batchSqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        ShelfGoodsMapper mapper = batchSqlSession.getMapper(ShelfGoodsMapper.class);
        try {
            for (ShelfGoods shelfGoods : saveList) {
                shelfGoods.setSysClinicId(user.getSysClinicId());
                mapper.insert(shelfGoods);
            }

            for (ShelfGoods shelfGoods : updateList) {
                mapper.updateById(shelfGoods.getIymShelfPositionId(), shelfGoods.getMaxQuantity(),
                        shelfGoods.getMinQuantity(), shelfGoods.getId());
            }
            batchSqlSession.commit();
        } finally {
            batchSqlSession.close();
        }
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(Integer sysClinicId,
                                                             Integer gsmGoodsTypeId,
                                                             String gsmGoodsName,
                                                             String iymShelfPositionName) {
        return shelfGoodsMapper.selectClinicListByCriteria(sysClinicId, gsmGoodsTypeId, gsmGoodsName, iymShelfPositionName);
    }


}
