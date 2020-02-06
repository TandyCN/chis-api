package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryType;
import pers.tandy.chis.modules.inventorymanagement.dao.InventoryTypeMapper;
import pers.tandy.chis.modules.inventorymanagement.service.InventoryTypeService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/9/29 18:07
 * @Version 1.0
 */
@CacheConfig(cacheNames = "InventoryType")
@Service
public class InventoryTypeServiceImpl implements InventoryTypeService {

    private InventoryTypeMapper inventoryTypeMapper;
    @Autowired
    public void setInventoryTypeMapper(InventoryTypeMapper inventoryTypeMapper) {
        this.inventoryTypeMapper = inventoryTypeMapper;
    }

    @Cacheable(key = "'all'")
    @Override
    public List<InventoryType> getAll() {
        return inventoryTypeMapper.selectByExample(null);
    }
}
