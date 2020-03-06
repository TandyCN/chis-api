package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAllot;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryAllotExample;

public interface InventoryAllotMapper {
    long countByExample(InventoryAllotExample example);

    int deleteByExample(InventoryAllotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InventoryAllot record);

    int insertSelective(InventoryAllot record);

    List<InventoryAllot> selectByExample(InventoryAllotExample example);

    InventoryAllot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InventoryAllot record, @Param("example") InventoryAllotExample example);

    int updateByExample(@Param("record") InventoryAllot record, @Param("example") InventoryAllotExample example);

    int updateByPrimaryKeySelective(InventoryAllot record);

    int updateByPrimaryKey(InventoryAllot record);

    /* -------------------------------------------------------------------------------------------------------------- */

    // int insertList(@Param("allotList") List<InventoryAllot> allotList);

    int updateApproveStateByLsh(@Param("approverId") Integer approverId,
                                @Param("approveDate") Date approvedate,
                                @Param("approveState") Byte approveState,
                                @Param("lsh") String lsh);

    List<Map<String, Object>> selectClinicListByCriteria(@Param("creationDate") String[] creationDate,
                                                         @Param("sysClinicId") Integer sysClinicId,
                                                         @Param("approveState") Byte approveState,
                                                         @Param("gsmGoodsName") String gsmGoodsName);

    List<Map<String, Object>> selectClinicLshGroupListByCriteria(@Param("creationDate") String[] creationDate,
                                                                 @Param("sysClinicId") Integer sysClinicId,
                                                                 @Param("approveState") Byte approveState);

    List<Map<String, Object>> selectByLsh(String lsh);
}
