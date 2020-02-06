package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItemRecord;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItemRecordExample;

public interface PerformItemRecordMapper {
    long countByExample(PerformItemRecordExample example);

    int deleteByExample(PerformItemRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerformItemRecord record);

    int insertSelective(PerformItemRecord record);

    List<PerformItemRecord> selectByExample(PerformItemRecordExample example);

    PerformItemRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerformItemRecord record, @Param("example") PerformItemRecordExample example);

    int updateByExample(@Param("record") PerformItemRecord record, @Param("example") PerformItemRecordExample example);

    int updateByPrimaryKeySelective(PerformItemRecord record);

    int updateByPrimaryKey(PerformItemRecord record);

    /******************************************************************************************************************/

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("mrmMemberName") String mrmMemberName,
                                               @Param("operatorName") String operatorName);
}
