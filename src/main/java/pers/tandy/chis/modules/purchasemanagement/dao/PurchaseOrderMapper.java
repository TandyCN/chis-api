package pers.tandy.chis.modules.purchasemanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchaseOrder;
import pers.tandy.chis.modules.purchasemanagement.bean.PurchaseOrderExample;

public interface PurchaseOrderMapper {
    long countByExample(PurchaseOrderExample example);

    int deleteByExample(PurchaseOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    List<PurchaseOrder> selectByExample(PurchaseOrderExample example);

    PurchaseOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByExample(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByPrimaryKeySelective(PurchaseOrder record);

    int updateByPrimaryKey(PurchaseOrder record);

    /* -------------------------------------------------------------------------------------------------------------- */

    int insertList(@Param("poList") List<PurchaseOrder> purchaseOrderList);

    int updateApproveStateByLsh(@Param("approverId") Integer approverId,
                                @Param("approveDate") Date approvedate,
                                @Param("updateApproveState") Byte updateApproveState,
                                @Param("lsh") String lsh,
                                @Param("currentApproveState") Byte currentApproveState);

    int updateInventoryStateByCriteria(@Param("inventoryState") Boolean inventoryState,
                                       @Param("lsh") String lsh,
                                       @Param("sysClinicId") Integer sysClinicId);

    List<Map<String, Object>> selectLshGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                           @Param("approveState") Byte approveState,
                                                           @Param("lsh") String lsh,
                                                           @Param("pemSupplierName") String pemSupplierName);

    List<Map<String, Object>> selectGoodsGroupListByLsh(String lsh);

    List<Map<String, Object>> selectClinicLshGroupListByInventoryState(@Param("sysClinicId") Integer sysClinicId,
                                                                       @Param("inventoryState") Boolean inventoryState);

    List<Map<String, Object>> selectClinicListByLsh(@Param("lsh") String lsh,
                                                    @Param("sysClinicId") Integer sysClinicId);

    List<Map<String, Object>> selectTrackListByLsh(String lsh);
}
