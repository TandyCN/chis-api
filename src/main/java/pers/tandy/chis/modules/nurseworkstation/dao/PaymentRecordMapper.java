package pers.tandy.chis.modules.nurseworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.nurseworkstation.bean.PaymentRecord;
import pers.tandy.chis.modules.nurseworkstation.bean.PaymentRecordExample;

public interface PaymentRecordMapper {
    long countByExample(PaymentRecordExample example);

    int deleteByExample(PaymentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentRecord record);

    int insertSelective(PaymentRecord record);

    List<PaymentRecord> selectByExample(PaymentRecordExample example);

    PaymentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    int updateByExample(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    int updateByPrimaryKeySelective(PaymentRecord record);

    int updateByPrimaryKey(PaymentRecord record);

    /******************************************************************************************************************/

    List<Map<String, Object>> selectClinicListByCriteria(@Param("creationDate") String[] creationDate,
                                                         @Param("sysClinicId") Integer sysClinicId,
                                                         @Param("lsh") String lsh,
                                                         @Param("creatorName") String creatorName);

    Map<String, Object> selectClinicGroupByLsh(@Param("sysClinicId") Integer sysClinicId,
                                               @Param("lsh") String lsh);


}
