package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.PaymentWay;
import pers.tandy.chis.modules.systemmanagement.bean.PaymentWayExample;

public interface PaymentWayMapper {
    long countByExample(PaymentWayExample example);

    int deleteByExample(PaymentWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentWay record);

    int insertSelective(PaymentWay record);

    List<PaymentWay> selectByExample(PaymentWayExample example);

    PaymentWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentWay record, @Param("example") PaymentWayExample example);

    int updateByExample(@Param("record") PaymentWay record, @Param("example") PaymentWayExample example);

    int updateByPrimaryKeySelective(PaymentWay record);

    int updateByPrimaryKey(PaymentWay record);
}