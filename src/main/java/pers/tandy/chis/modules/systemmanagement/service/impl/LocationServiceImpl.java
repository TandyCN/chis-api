package pers.tandy.chis.modules.systemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.systemmanagement.bean.Location;
import pers.tandy.chis.modules.systemmanagement.bean.LocationExample;
import pers.tandy.chis.modules.systemmanagement.dao.LocationMapper;
import pers.tandy.chis.modules.systemmanagement.service.LocationService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/10/20 21:05
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Location")
@Service
public class LocationServiceImpl implements LocationService {
    private LocationMapper locationMapper;
    @Autowired
    public void setLocationMapper(LocationMapper locationMapper) {
        this.locationMapper = locationMapper;
    }

    @Cacheable(key = "'provinceIdGroupList'")
    @Override
    public List<Map<String, Object>> getProvinceIdGroupList() {
        return locationMapper.selectProvinceIdGroupList();
    }

    @Override
    public List<Map<String, Object>> getCityIdGroupListByProvinceId(Integer provinceId) {
        return locationMapper.selectCityIdGroupListByProvinceId(provinceId);
    }

    @Override
    public List<Location> getByCityId(Integer cityId) {
        LocationExample example = new LocationExample();
        example.createCriteria().andCityIdEqualTo(cityId);
        return locationMapper.selectByExample(example);
    }

    @Override
    public Location getById(Integer id) {
        return locationMapper.selectByPrimaryKey(id);
    }

}
