package pers.tandy.chis.modules.purchasemanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.purchasemanagement.bean.Supplier;
import pers.tandy.chis.modules.purchasemanagement.dao.SupplierMapper;
import pers.tandy.chis.modules.purchasemanagement.service.SupplierService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/8/23 16:01
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Supplier")
@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierMapper supplierMapper;
    @Autowired
    public void setSupplierMapper(SupplierMapper supplierMapper) {
        this.supplierMapper = supplierMapper;
    }

    @Override
    public void save(Supplier supplier) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        supplier.setCreatorId(user.getId());
        supplier.setCreationDate(new Date());

        supplierMapper.insert(supplier);
    }

    @CachePut(key = "#supplier.id")
    @Override
    public Supplier update(Supplier supplier) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        supplier.setLastUpdaterId(user.getId());
        supplier.setLastUpdateDate(new Date());

        supplierMapper.updateByPrimaryKey(supplier);
        return supplier;
    }

    @CacheEvict(key = "#supplier.id")
    @Override
    public Supplier delete(Supplier supplier) {
        supplierMapper.deleteByPrimaryKey(supplier.getId());
        return supplier;
    }

    @Cacheable(key = "#id")
    @Override
    public Supplier getById(Integer id) {
        return supplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer oid, Boolean state, String name) {
        return supplierMapper.selectByCriteria(oid, state, name);
    }

    @Override
    public List<Map<String, Object>> getEnabledLikeByName(String name) {
        return supplierMapper.selectEnabledLikeByName(name);
    }
}
