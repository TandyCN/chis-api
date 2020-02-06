package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.Clinic;
import pers.tandy.chis.modules.systemmanagement.bean.ClinicExample;

public interface ClinicMapper {
    long countByExample(ClinicExample example);

    int deleteByExample(ClinicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clinic record);

    int insertSelective(Clinic record);

    List<Clinic> selectByExample(ClinicExample example);

    Clinic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clinic record, @Param("example") ClinicExample example);

    int updateByExample(@Param("record") Clinic record, @Param("example") ClinicExample example);

    int updateByPrimaryKeySelective(Clinic record);

    int updateByPrimaryKey(Clinic record);
}