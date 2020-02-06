package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.DepositRecord;
import pers.tandy.chis.modules.membermanagement.bean.DepositRecordExample;

public interface DepositRecordMapper {
    long countByExample(DepositRecordExample example);

    int deleteByExample(DepositRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DepositRecord record);

    int insertSelective(DepositRecord record);

    List<DepositRecord> selectByExample(DepositRecordExample example);

    DepositRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DepositRecord record, @Param("example") DepositRecordExample example);

    int updateByExample(@Param("record") DepositRecord record, @Param("example") DepositRecordExample example);

    int updateByPrimaryKeySelective(DepositRecord record);

    int updateByPrimaryKey(DepositRecord record);

    /******************************************************************************************************************/

    List<Map<String, Object>> selectByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                               @Param("creationDate") String[] creationDate,
                                               @Param("lsh") String lsh,
                                               @Param("mrmMemberName") String mrmMemberName,
                                               @Param("returned") Boolean returned);
}
