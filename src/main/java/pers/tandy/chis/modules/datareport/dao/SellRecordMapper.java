package pers.tandy.chis.modules.datareport.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.datareport.bean.SellRecord;
import pers.tandy.chis.modules.datareport.bean.SellRecordExample;

public interface SellRecordMapper {
    long countByExample(SellRecordExample example);

    int deleteByExample(SellRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellRecord record);

    int insertSelective(SellRecord record);

    List<SellRecord> selectByExample(SellRecordExample example);

    SellRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellRecord record, @Param("example") SellRecordExample example);

    int updateByExample(@Param("record") SellRecord record, @Param("example") SellRecordExample example);

    int updateByPrimaryKeySelective(SellRecord record);

    int updateByPrimaryKey(SellRecord record);

    /******************************************************************************************************************/

    void insertList(@Param("sellRecordList") List<SellRecord> sellRecordList);

    void updateReturnedByIdList(@Param("idList") List<Integer> idList);

    void updateInvoiceByIdList(@Param("idList") List<Integer> idList,
                               @Param("invoiceTypeId") Integer invoiceTypeId,
                               @Param("invoiceNo") String invoiceNo);

    List<Map<String, Object>> selectByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                               @Param("creationDate") String[] creationDate,
                                               @Param("lsh") String lsh,
                                               @Param("sellerName") String sellerName);

    List<Map<String, Object>> selectClinicGroupListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                              @Param("creationDate") String[] creationDate,
                                                              @Param("lsh") String lsh,
                                                              @Param("mrmMemberName") String mrmMemberName);

    List<Map<String, Object>> selectClinicUnreturnedListByLsh(@Param("sysClinicId") Integer sysClinicId,
                                                              @Param("lsh") String lsh);

    List<Map<String, Object>> selectClinicListByLsh(@Param("sysClinicId") Integer sysClinicId,
                                                    @Param("lsh") String lsh);
}
