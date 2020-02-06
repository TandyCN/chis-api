package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistory;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistoryExample;

public interface ClinicalHistoryMapper {
    long countByExample(ClinicalHistoryExample example);

    int deleteByExample(ClinicalHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClinicalHistory record);

    int insertSelective(ClinicalHistory record);

    List<ClinicalHistory> selectByExample(ClinicalHistoryExample example);

    ClinicalHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClinicalHistory record, @Param("example") ClinicalHistoryExample example);

    int updateByExample(@Param("record") ClinicalHistory record, @Param("example") ClinicalHistoryExample example);

    int updateByPrimaryKeySelective(ClinicalHistory record);

    int updateByPrimaryKey(ClinicalHistory record);

    /* -------------------------------------------------------------------------------------------------------------- */

    void updateFinishedById(@Param("finished") Boolean finished, @Param("id") Integer id);

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("mrmMemberId") Integer mrmMemberId,
                                               @Param("dwtDiagnoseTypeId") Integer dwtDiagnoseTypeId);

    Map<String, Object> selectLastUnfinishedByCriteria(@Param("mrmMemberId") Integer mrmMemberId,
                                                       @Param("sysDoctorId") Integer sysDoctorId);
}
