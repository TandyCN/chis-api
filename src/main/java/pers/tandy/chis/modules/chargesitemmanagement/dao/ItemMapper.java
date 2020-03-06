package pers.tandy.chis.modules.chargesitemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.chargesitemmanagement.bean.Item;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemExample;

public interface ItemMapper {
    long countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);


    /*----------------------------------------------------------------------------------------------------------------*/

    void updateRetailPriceById(@Param("retailPrice") Float retailPrice, @Param("id") Integer id);

    List<Map<String, Object>> selectByCriteria(@Param("cimItemTypeId") Integer cimItemTypeId,
                                               @Param("state") Boolean state,
                                               @Param("itemClassifyId") Integer itemClassifyId,
                                               @Param("discountable") Boolean discountable,
                                               @Param("name") String name);

    List<Map<String, Object>> selectEnabledLikeByName(@Param("name") String name);

    List<Map<String, Object>> selectEnabledLikeByNameForPrescription(@Param("cimItemTypeId") Integer cimItemTypeId,
                                                                     @Param("name") String name);

}
