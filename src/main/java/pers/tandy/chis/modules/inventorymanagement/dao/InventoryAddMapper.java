package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAdd;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAddExample;

public interface InventoryAddMapper {
    long countByExample(InventoryAddExample example);

    int deleteByExample(InventoryAddExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InventoryAdd record);

    int insertSelective(InventoryAdd record);

    List<InventoryAdd> selectByExample(InventoryAddExample example);

    InventoryAdd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InventoryAdd record, @Param("example") InventoryAddExample example);

    int updateByExample(@Param("record") InventoryAdd record, @Param("example") InventoryAddExample example);

    int updateByPrimaryKeySelective(InventoryAdd record);

    int updateByPrimaryKey(InventoryAdd record);

    /* -------------------------------------------------------------------------------------------------------------- */

    // int insertList(@Param("addList") List<InventoryAdd> addList);

    int updateApproveStateByLsh(@Param("approverId") Integer approverId,
                                @Param("approveDate") Date approvedate,
                                @Param("updateApproveState") Byte updateApproveState,
                                @Param("lsh") String lsh,
                                @Param("currentApproveState") Byte currentApproveState);

    List<Map<String, Object>> selectClinicListByCriteria(@Param("creationDate") String[] creationDate,
                                                         @Param("sysClinicId") Integer sysClinicId,
                                                         @Param("approveState") Byte approveState,
                                                         @Param("actionType") Byte actionType,
                                                         @Param("pemSupplierName") String pemSupplierName);

    List<Map<String, Object>> selectClinicLshGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                                 @Param("sysClinicId") Integer sysClinicId,
                                                                 @Param("approveState") Byte approveState,
                                                                 @Param("pemSupplierName") String pemSupplierName);

    List<Map<String, Object>> selectByLsh(String lsh);

}
