package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.LossRecord;
import pers.tandy.chis.modules.inventorymanagement.bean.LossRecordExample;

public interface LossRecordMapper {
    long countByExample(LossRecordExample example);

    int deleteByExample(LossRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LossRecord record);

    int insertSelective(LossRecord record);

    List<LossRecord> selectByExample(LossRecordExample example);

    LossRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LossRecord record, @Param("example") LossRecordExample example);

    int updateByExample(@Param("record") LossRecord record, @Param("example") LossRecordExample example);

    int updateByPrimaryKeySelective(LossRecord record);

    int updateByPrimaryKey(LossRecord record);

    /*----------------------------------------------------------------------------------------------------------------*/

    void insertList(@Param("lossRecordList") List<LossRecord> lossRecordList);

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
