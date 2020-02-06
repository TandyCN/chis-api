package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.VisitRecord;
import pers.tandy.chis.modules.doctorworkstation.bean.VisitRecordExample;

import javax.validation.constraints.Past;

public interface VisitRecordMapper {
    long countByExample(VisitRecordExample example);

    int deleteByExample(VisitRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VisitRecord record);

    int insertSelective(VisitRecord record);

    List<VisitRecord> selectByExample(VisitRecordExample example);

    VisitRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VisitRecord record, @Param("example") VisitRecordExample example);

    int updateByExample(@Param("record") VisitRecord record, @Param("example") VisitRecordExample example);

    int updateByPrimaryKeySelective(VisitRecord record);

    int updateByPrimaryKey(VisitRecord record);

    /* -------------------------------------------------------------------------------------------------------------- */
    List<Map<String, Object>> selectByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                               @Param("creatorId") Integer creatorId,
                                               @Param("appointmentDate") String[] appointmentDate,
                                               @Param("mrmMemberName") String mrmMemberName,
                                               @Param("finished") Boolean finished);
}
