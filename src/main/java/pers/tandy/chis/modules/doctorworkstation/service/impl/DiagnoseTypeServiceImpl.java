package pers.tandy.chis.modules.doctorworkstation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseType;
import pers.tandy.chis.modules.doctorworkstation.dao.DiagnoseTypeMapper;
import pers.tandy.chis.modules.doctorworkstation.service.DiagnoseTypeService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/11/7 22:45
 * @Version 1.0
 */
@CacheConfig(cacheNames = "DiagnoseType")
@Service
public class DiagnoseTypeServiceImpl implements DiagnoseTypeService {

    private DiagnoseTypeMapper diagnoseTypeMapper;
    @Autowired
    public void setDiagnoseTypeMapper(DiagnoseTypeMapper diagnoseTypeMapper) {
        this.diagnoseTypeMapper = diagnoseTypeMapper;
    }

    @Cacheable(key = "'all'")
    @Override
    public List<DiagnoseType> getAll() {
        return diagnoseTypeMapper.selectByExample(null);
    }
}
