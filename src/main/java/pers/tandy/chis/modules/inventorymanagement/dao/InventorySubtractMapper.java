package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.InventorySubtract;
import pers.tandy.chis.modules.inventorymanagement.bean.InventorySubtractExample;

public interface InventorySubtractMapper {
    long countByExample(InventorySubtractExample example);

    int deleteByExample(InventorySubtractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InventorySubtract record);

    int insertSelective(InventorySubtract record);

    List<InventorySubtract> selectByExample(InventorySubtractExample example);

    InventorySubtract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InventorySubtract record, @Param("example") InventorySubtractExample example);

    int updateByExample(@Param("record") InventorySubtract record, @Param("example") InventorySubtractExample example);

    int updateByPrimaryKeySelective(InventorySubtract record);

    int updateByPrimaryKey(InventorySubtract record);


    /* -------------------------------------------------------------------------------------------------------------- */
    int insertList(@Param("subtractList") List<InventorySubtract> subtractList);

    int updateApproveStateByLsh(@Param("approverId") Integer approverId,
                                @Param("approveDate") Date approvedate,
                                @Param("approveState") Byte approveState,
                                @Param("lsh") String lsh);

    List<Map<String, Object>> selectClinicListByCriteria(@Param("creationDate") String[] creationDate,
                                                         @Param("sysClinicId") Integer sysClinicId,
                                                         @Param("approveState") Byte approveState,
                                                         @Param("pemSupplierName") String pemSupplierName);

    List<Map<String, Object>> selectClinicLshGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                                 @Param("sysClinicId") Integer sysClinicId,
                                                                 @Param("approveState") Byte approveState,
                                                                 @Param("pemSupplierName") String pemSupplierName);

    List<Map<String, Object>> selectByLsh(@Param("lsh") String lsh);
}
