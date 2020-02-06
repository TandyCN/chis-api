package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.Authc;
import pers.tandy.chis.modules.systemmanagement.bean.AuthcExample;

public interface AuthcMapper {
    long countByExample(AuthcExample example);

    int deleteByExample(AuthcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Authc record);

    int insertSelective(Authc record);

    List<Authc> selectByExample(AuthcExample example);

    Authc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Authc record, @Param("example") AuthcExample example);

    int updateByExample(@Param("record") Authc record, @Param("example") AuthcExample example);

    int updateByPrimaryKeySelective(Authc record);

    int updateByPrimaryKey(Authc record);

    void updateRoleNamesByMap(Map<Integer, String> roleAuthc);
}
