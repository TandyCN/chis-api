package pers.tandy.chis.modules.systemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.systemmanagement.bean.Dict;
import pers.tandy.chis.modules.systemmanagement.bean.DictExample;
import pers.tandy.chis.modules.systemmanagement.dao.DictMapper;
import pers.tandy.chis.modules.systemmanagement.service.DictService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/7/28 19:43
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Dict")
@Service
public class DictServiceImpl implements DictService {
    private DictMapper dictMapper;
    @Autowired
    public void setDictMapper(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    @CacheEvict(key = "'TypeId:' + #dict.sysDictTypeId")
    @Override
    public void save(Dict dict) {
        dictMapper.insert(dict);
    }

    @Caching(
            put = {
                    @CachePut(key = "#dict.id")
            },
            evict = {
                    @CacheEvict(key = "'TypeId:' + #dict.sysDictTypeId")
            }
    )
    @Override
    public Dict update(Dict dict) {
        dictMapper.updateByPrimaryKey(dict);
        return dict;
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#dict.id"),
                    @CacheEvict(key = "'TypeId:' + #dict.sysDictTypeId")
            }
    )
    @Override
    public Dict delete(Dict dict) {
        dictMapper.deleteByPrimaryKey(dict.getId());
        return dict;
    }

    @Cacheable(key = "#id")
    @Override
    public Dict getById(Integer id) {
        return dictMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dict> getByCriteria(String name, Integer sysDictTypeId, Boolean state) {
        return dictMapper.selectByCriteria(name, sysDictTypeId, state);
    }

    @Cacheable(key = "'TypeId:' + #sysDictTypeId")
    @Override
    public List<Dict> getEnabledByTypeId(Integer sysDictTypeId) {
        DictExample example = new DictExample();
        example.createCriteria().andSysDictTypeIdEqualTo(sysDictTypeId).andStateEqualTo(true);
        return dictMapper.selectByExample(example);
    }

    @Override
    public List<Dict> getEnabledLikeByName(Integer sysDictTypeId, String name) {
        return dictMapper.selectEnabledLikeByName(sysDictTypeId, name);
    }
}
