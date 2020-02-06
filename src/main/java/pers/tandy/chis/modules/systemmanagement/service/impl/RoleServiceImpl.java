package pers.tandy.chis.modules.systemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.modules.systemmanagement.bean.Authc;
import pers.tandy.chis.modules.systemmanagement.bean.Role;
import pers.tandy.chis.modules.systemmanagement.bean.RoleExample;
import pers.tandy.chis.modules.systemmanagement.dao.RoleMapper;
import pers.tandy.chis.modules.systemmanagement.service.AuthcService;
import pers.tandy.chis.modules.systemmanagement.service.RoleService;

import java.util.HashSet;
import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/7/20 13:54
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Role")
@Service
public class RoleServiceImpl implements RoleService {

    private RoleMapper roleMapper;
    @Autowired
    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    private AuthcService authcService;
    @Autowired
    public void setAuthcService(AuthcService authcService) {
        this.authcService = authcService;
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    @CacheEvict(key = "'enabled'")
    @Override
    public void save(Role role) {
        roleMapper.insert(role);
    }

    @Caching(
            put = {
                    @CachePut(key = "#role.id")
            },
            evict = {
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public Role update(Role role) {
        roleMapper.updateByPrimaryKey(role);
        return role;
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#id"),
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public void delete(Integer id) {
        roleMapper.deleteByPrimaryKey(id);

        List<Authc> allAuthcList = authcService.getAll();
        authcService.updateRoleNames(allAuthcList, id.toString(), new HashSet<>());
    }

    @Cacheable(key = "#id")
    @Override
    public Role getById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> getByCriteria(String name, Boolean state) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(name + "%");
        RoleExample.Criteria criteria2 = example.createCriteria();
        criteria2.andCodeLike(name + "%");
        if(state != null) {
            criteria.andStateEqualTo(state);
            criteria2.andStateEqualTo(state);
        }
        example.or(criteria2);
        example.setOrderByClause("id DESC");
        return roleMapper.selectByExample(example);
    }

    @Cacheable(key = "'enabled'")
    @Override
    public List<Role> getEnabled() {
        RoleExample example = new RoleExample();
        example.createCriteria().andStateEqualTo(true);
        return roleMapper.selectByExample(example);
    }
}
