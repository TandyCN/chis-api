package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.Doctor;
import pers.tandy.chis.modules.systemmanagement.bean.DoctorExample;

public interface DoctorMapper {
    long countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    /* -------------------------------------------------------------------------------------------------------------- */
    List<Map<String, Object>> selectClinicListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                         @Param("name") String name);

    List<Map<String, Object>> selectClinicEnabled(@Param("sysClinicId") Integer sysClinicId);

    List<Map<String, Object>> selectAllEnabled();
}
