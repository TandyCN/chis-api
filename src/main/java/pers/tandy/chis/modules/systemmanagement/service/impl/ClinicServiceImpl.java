package pers.tandy.chis.modules.systemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.systemmanagement.bean.Clinic;
import pers.tandy.chis.modules.systemmanagement.bean.ClinicExample;
import pers.tandy.chis.modules.systemmanagement.dao.ClinicMapper;
import pers.tandy.chis.modules.systemmanagement.service.ClinicService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/7/19 9:40
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Clinic")
@Service
public class ClinicServiceImpl implements ClinicService {

    private ClinicMapper clinicMapper;
    @Autowired
    public void setClinicMapper(ClinicMapper clinicMapper) {
        this.clinicMapper = clinicMapper;
    }

    @CacheEvict(key = "'enabled'")
    @Override
    public void save(Clinic clinic) {
        clinicMapper.insert(clinic);
    }

    @Caching(
            put = {
                    @CachePut(key = "#clinic.id")
            },
            evict = {
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public Clinic update(Clinic clinic) {
        clinicMapper.updateByPrimaryKey(clinic);
        return clinic;
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#id"),
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public void delete(Integer id) {
        clinicMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(key = "#id")
    @Override
    public Clinic getById(Integer id) {
        return clinicMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Clinic> getByCriteria(String name) {
        ClinicExample example = new ClinicExample();
        example.createCriteria().andNameLike(name + "%");
        example.or(example.createCriteria().andCodeLike(name + "%"));
        example.setOrderByClause("id DESC");
        return clinicMapper.selectByExample(example);
    }

    @Cacheable(key = "'enabled'")
    @Override
    public List<Clinic> getEnabled() {
        ClinicExample example = new ClinicExample();
        example.createCriteria().andStateEqualTo(true);
        return clinicMapper.selectByExample(example);
    }
}
