package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.MemberType;
import pers.tandy.chis.modules.membermanagement.bean.MemberTypeExample;

public interface MemberTypeMapper {
    long countByExample(MemberTypeExample example);

    int deleteByExample(MemberTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberType record);

    int insertSelective(MemberType record);

    List<MemberType> selectByExample(MemberTypeExample example);

    MemberType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByPrimaryKeySelective(MemberType record);

    int updateByPrimaryKey(MemberType record);
}