package pers.tandy.chis.modules.goodsitemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsType;
import pers.tandy.chis.modules.goodsitemmanagement.dao.GoodsTypeMapper;
import pers.tandy.chis.modules.goodsitemmanagement.service.GoodsTypeService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/8/21 11:33
 * @Version 1.0
 */
@CacheConfig(cacheNames = "GoodsType")
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
        this.goodsTypeMapper = goodsTypeMapper;
    }

    @Cacheable(key = "'all'")
    @Override
    public List<GoodsType> getAll() {
        return goodsTypeMapper.selectByExample(null);
    }
}
