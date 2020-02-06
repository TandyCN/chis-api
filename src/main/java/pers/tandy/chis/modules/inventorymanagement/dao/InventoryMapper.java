package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.Inventory;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryExample;

public interface InventoryMapper {
    long countByExample(InventoryExample example);

    int deleteByExample(InventoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryExample example);

    Inventory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    /* -------------------------------------------------------------------------------------------------------------- */

    int insertList(@Param("inventoryList") List<Inventory> inventoryList);

    int updateQuantityByList(@Param("inventoryList") List<Inventory> inventoryList);

    void updateQuantityById(@Param("id") Integer id, @Param("quantity") Short quantity);

    List<Inventory> selectLastByGoodsIdList(@Param("goodsIdList") List<Integer> goodsIdList);

    List<Map<String, Object>> selectClinicPchEnabledLikeByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                                   @Param("iymInventoryTypeId") Integer iymInventoryTypeId,
                                                                   @Param("gsmGoodsName") String gsmGoodsName);

    List<Map<String, Object>> selectClinicPchEnabledByCriteriaForOutInventory(@Param("sysClinicId") Integer sysClinicId,
                                                                              @Param("gsmGoodsId") Integer gsmGoodsId);

    List<Map<String, Object>> selectClinicSubtractPchLikeByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                                    @Param("iymInventoryTypeId") Integer iymInventoryTypeId,
                                                                    @Param("pemSupplierId") Integer pemSupplierId,
                                                                    @Param("gsmGoodsName") String gsmGoodsName);

    List<Map<String, Object>> selectByIdList(@Param("idList") List<Integer> idList);

    List<Map<String, Object>> selectPhGroupListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                          @Param("iymInventoryTypeId") Integer iymInventoryTypeId,
                                                          @Param("showZero") Boolean showZero,
                                                          @Param("sysClinicName") String sysClinicName,
                                                          @Param("gsmGoodsName") String gsmGoodsName,
                                                          @Param("ph") String ph);

    List<Map<String, Object>> selectClinicPchListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                            @Param("iymInventoryTypeId") Integer iymInventoryTypeId,
                                                            @Param("showZero") Boolean showZero,
                                                            @Param("gsmGoodsName") String gsmGoodsName,
                                                            @Param("ph") String ph);

}
