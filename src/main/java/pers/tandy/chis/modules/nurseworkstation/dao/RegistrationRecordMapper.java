package pers.tandy.chis.modules.nurseworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.nurseworkstation.bean.RegistrationRecord;
import pers.tandy.chis.modules.nurseworkstation.bean.RegistrationRecordExample;

public interface RegistrationRecordMapper {
    long countByExample(RegistrationRecordExample example);

    int deleteByExample(RegistrationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegistrationRecord record);

    int insertSelective(RegistrationRecord record);

    List<RegistrationRecord> selectByExample(RegistrationRecordExample example);

    RegistrationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegistrationRecord record, @Param("example") RegistrationRecordExample example);

    int updateByExample(@Param("record") RegistrationRecord record, @Param("example") RegistrationRecordExample example);

    int updateByPrimaryKeySelective(RegistrationRecord record);

    int updateByPrimaryKey(RegistrationRecord record);

    /******************************************************************************************************************/

    List<Map<String, Object>> selectClinicListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                         @Param("creationDate") String[] creationDate,
                                                         @Param("mrmMemberName")String mrmMemberName,
                                                         @Param("cimItemName")String cimItemName,
                                                         @Param("sysDoctorName")String sysDoctorName);
}
