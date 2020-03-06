package pers.tandy.chis.modules.purchasemanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchasePlan;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchasePlanExample;

public interface PurchasePlanMapper {
    long countByExample(PurchasePlanExample example);

    int deleteByExample(PurchasePlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchasePlan record);

    int insertSelective(PurchasePlan record);

    List<PurchasePlan> selectByExample(PurchasePlanExample example);

    PurchasePlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchasePlan record, @Param("example") PurchasePlanExample example);

    int updateByExample(@Param("record") PurchasePlan record, @Param("example") PurchasePlanExample example);

    int updateByPrimaryKeySelective(PurchasePlan record);

    int updateByPrimaryKey(PurchasePlan record);

    /*---------------------------------------------------------------------------------------------------------------*/

    // void insertList(@Param("ppList") List<PurchasePlan> purchasePlanList);

    void updateApproveStateByPlanIdList(@Param("approveState") Byte approveState,
                                       @Param("approverId") Integer approverId,
                                       @Param("approveDate") Date approveDate,
                                       @Param("planList") List<PurchasePlan> planList);

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("approveDate") String[] approveDate,
                                               @Param("approverId") Integer approverId,
                                               @Param("approveState") Byte approveState,
                                               @Param("sysClinicId") Integer sysClinicId,
                                               @Param("sysClinicName") String sysClinicName,
                                               @Param("gsmGoodsName") String gsmGoodsName);

    List<Map<String, Object>> selectByPlanIdList(@Param("planIdList") List<Integer> planIdList);





}
