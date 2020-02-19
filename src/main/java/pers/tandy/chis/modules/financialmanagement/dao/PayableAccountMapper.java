package pers.tandy.chis.modules.financialmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.financialmanagement.bean.PayableAccount;
import pers.tandy.chis.modules.financialmanagement.bean.PayableAccountExample;

public interface PayableAccountMapper {
    long countByExample(PayableAccountExample example);

    int deleteByExample(PayableAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayableAccount record);

    int insertSelective(PayableAccount record);

    List<PayableAccount> selectByExample(PayableAccountExample example);

    PayableAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayableAccount record, @Param("example") PayableAccountExample example);

    int updateByExample(@Param("record") PayableAccount record, @Param("example") PayableAccountExample example);

    int updateByPrimaryKeySelective(PayableAccount record);

    int updateByPrimaryKey(PayableAccount record);


    /* -------------------------------------------------------------------------------------------------------------- */

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("pemSupplierId") Integer pemSupplierId,
                                               @Param("sysClinicId") Integer sysClinicId,
                                               @Param("payUp") Boolean payUp);
}
