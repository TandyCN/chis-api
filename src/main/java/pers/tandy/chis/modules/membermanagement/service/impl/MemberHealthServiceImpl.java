package pers.tandy.chis.modules.membermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.membermanagement.bean.MemberHealth;
import pers.tandy.chis.modules.membermanagement.bean.MemberHealthExample;
import pers.tandy.chis.modules.membermanagement.dao.MemberHealthMapper;
import pers.tandy.chis.modules.membermanagement.service.MemberHealthService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/10/24 15:45
 * @Version 1.0
 */
@CacheConfig(cacheNames = "MemberHealth")
@Service
public class MemberHealthServiceImpl implements MemberHealthService {

    private MemberHealthMapper memberHealthMapper;
    @Autowired
    public void setMemberHealthMapper(MemberHealthMapper memberHealthMapper) {
        this.memberHealthMapper = memberHealthMapper;
    }

    @Override
    public void save(Integer mrmMemberId, List<MemberHealth> memberHealthList) {
        // 清空之前的记录
        this.delete(mrmMemberId);
        // 保存
        memberHealthMapper.insertList(memberHealthList);
    }

    @CacheEvict(key = "#mrmMemberId")
    @Override
    public void delete(Integer mrmMemberId) {
        MemberHealthExample example = new MemberHealthExample();
        example.createCriteria().andMrmMemberIdEqualTo(mrmMemberId);
        memberHealthMapper.deleteByExample(example);
    }

    @Cacheable(key = "#mrmMemberId")
    @Override
    public List<MemberHealth> getByMrmMemberId(Integer mrmMemberId) {
        MemberHealthExample example = new MemberHealthExample();
        example.createCriteria().andMrmMemberIdEqualTo(mrmMemberId);
        return memberHealthMapper.selectByExample(example);
    }

}
