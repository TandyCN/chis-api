package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.MemberHealth;
import pers.tandy.chis.modules.membermanagement.bean.MemberHealthExample;

public interface MemberHealthMapper {
    long countByExample(MemberHealthExample example);

    int deleteByExample(MemberHealthExample example);

    int insert(MemberHealth record);

    int insertSelective(MemberHealth record);

    List<MemberHealth> selectByExample(MemberHealthExample example);

    int updateByExampleSelective(@Param("record") MemberHealth record, @Param("example") MemberHealthExample example);

    int updateByExample(@Param("record") MemberHealth record, @Param("example") MemberHealthExample example);

    /* -------------------------------------------------------------------------------------------------------------- */
    int insertList(@Param("memberHealthList") List<MemberHealth> memberHealthList);

}
