package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.SelfUsedRecord;
import pers.tandy.chis.modules.inventorymanagement.bean.SelfUsedRecordExample;

public interface SelfUsedRecordMapper {
    long countByExample(SelfUsedRecordExample example);

    int deleteByExample(SelfUsedRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SelfUsedRecord record);

    int insertSelective(SelfUsedRecord record);

    List<SelfUsedRecord> selectByExample(SelfUsedRecordExample example);

    SelfUsedRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SelfUsedRecord record, @Param("example") SelfUsedRecordExample example);

    int updateByExample(@Param("record") SelfUsedRecord record, @Param("example") SelfUsedRecordExample example);

    int updateByPrimaryKeySelective(SelfUsedRecord record);

    int updateByPrimaryKey(SelfUsedRecord record);

    /*----------------------------------------------------------------------------------------------------------------*/

    void insertList(@Param("selfUsedRecordList") List<SelfUsedRecord> selfUsedRecordList);

    void updateApproveState(@Param("approverId") Integer approverId,
                            @Param("approveDate") Date approveDate,
                            @Param("approveState") Byte approveState,
                            @Param("lsh") String lsh);

    List<Map<String, Object>> selectByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                               @Param("creationDate") String[] creationDate,
                                               @Param("lsh") String lsh,
                                               @Param("sysClinicName") String sysClinicName,
                                               @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectClinicGroupListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                              @Param("creationDate") String[] creationDate,
                                                              @Param("lsh") String lsh,
                                                              @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectByLsh(@Param("lsh") String lsh);
}
