package pers.tandy.chis.modules.financialmanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.financialmanagement.bean.PaidAccount;
import pers.tandy.chis.modules.financialmanagement.bean.PaidAccountExample;

public interface PaidAccountMapper {
    long countByExample(PaidAccountExample example);

    int deleteByExample(PaidAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaidAccount record);

    int insertSelective(PaidAccount record);

    List<PaidAccount> selectByExample(PaidAccountExample example);

    PaidAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaidAccount record, @Param("example") PaidAccountExample example);

    int updateByExample(@Param("record") PaidAccount record, @Param("example") PaidAccountExample example);

    int updateByPrimaryKeySelective(PaidAccount record);

    int updateByPrimaryKey(PaidAccount record);


    /* -------------------------------------------------------------------------------------------------------------- */

    void insertList(@Param("paidAccountList") List<PaidAccount> paidAccountList);

    void updateInvoiceNo(@Param("lshList") List<String> lshList,
                         @Param("invoiceNo") String invoiceNo);

    void updatePaymentNo(@Param("lshList") List<String> lshList,
                         @Param("paymentNo") String paymentNo,
                         @Param("payerId") Integer payerId,
                         @Param("payDate") Date payDate);

    void updateApproveStateByPaymentNo(@Param("paymentNo") String paymentNo,
                                       @Param("approverId") Integer approverId,
                                       @Param("approveDate") Date approveDate,
                                       @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectLshGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                           @Param("pemSupplierId") Integer pemSupplierId,
                                                           @Param("sysClinicId") Integer sysClinicId,
                                                           @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectByLsh(@Param("lsh") String lsh);

    List<Map<String, Object>> selectPaymentNoGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                                 @Param("pemSupplierId") Integer pemSupplierId,
                                                                 @Param("sysClinicId") Integer sysClinicId,
                                                                 @Param("approveState") Byte approveState,
                                                                 @Param("paymentNo") String paymentNo);

    List<Map<String, Object>> selectByPaymentNo(@Param("paymentNo") String paymentNo);

}
