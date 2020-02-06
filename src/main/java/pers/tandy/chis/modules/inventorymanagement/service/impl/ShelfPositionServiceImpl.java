package pers.tandy.chis.modules.inventorymanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfPosition;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfPositionExample;
import pers.tandy.chis.modules.inventorymanagement.dao.ShelfPositionMapper;
import pers.tandy.chis.modules.inventorymanagement.service.ShelfPositionService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2020/1/5 13:40
 * @Version 1.0
 */
@CacheConfig(cacheNames = "ShelfPosition")
@Service
public class ShelfPositionServiceImpl implements ShelfPositionService {
    private ShelfPositionMapper shelfPositionMapper;
    @Autowired
    public void setShelfPositionMapper(ShelfPositionMapper shelfPositionMapper) {
        this.shelfPositionMapper = shelfPositionMapper;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void save(ShelfPosition shelfPosition) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();  // 获取操作人信息

        shelfPosition.setSysClinicId(user.getSysClinicId());
        shelfPosition.setCreatorId(user.getId());
        shelfPosition.setCreationDate(new Date());
        shelfPositionMapper.insert(shelfPosition);
    }

    @CacheEvict(key = "#shelfPosition.sysClinicId")
    @Override
    public ShelfPosition update(ShelfPosition shelfPosition) {
        shelfPositionMapper.updateByPrimaryKey(shelfPosition);
        return shelfPosition;
    }

    @CacheEvict(key = "#shelfPosition.sysClinicId")
    @Override
    public void delete(ShelfPosition shelfPosition) {
        shelfPositionMapper.deleteByPrimaryKey(shelfPosition.getId());
    }

    @Override
    public ShelfPosition getById(Integer id) {
        return shelfPositionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ShelfPosition> getClinicListByCriteria(Integer sysClinicId, String name) {
        return shelfPositionMapper.selectClinicListByCriteria(sysClinicId, name);
    }

    @Cacheable(key = "#sysClinicId")
    @Override
    public List<ShelfPosition> getClinicListAll(Integer sysClinicId) {
        ShelfPositionExample example = new ShelfPositionExample();
        example.createCriteria().andSysClinicIdEqualTo(sysClinicId);
        example.setOrderByClause("name");
        return shelfPositionMapper.selectByExample(example);
    }
}
