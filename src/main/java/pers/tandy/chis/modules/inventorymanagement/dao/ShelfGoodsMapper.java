package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfGoods;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfGoodsExample;

public interface ShelfGoodsMapper {
    long countByExample(ShelfGoodsExample example);

    int deleteByExample(ShelfGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShelfGoods record);

    int insertSelective(ShelfGoods record);

    List<ShelfGoods> selectByExample(ShelfGoodsExample example);

    ShelfGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShelfGoods record, @Param("example") ShelfGoodsExample example);

    int updateByExample(@Param("record") ShelfGoods record, @Param("example") ShelfGoodsExample example);

    int updateByPrimaryKeySelective(ShelfGoods record);

    int updateByPrimaryKey(ShelfGoods record);


    /* ------------------------------------------------------------------------------------------------------------- */

    void saveList(@Param("shelfGoodsList") List<ShelfGoods> shelfGoodsList);

    void updateList(@Param("shelfGoodsList") List<ShelfGoods> shelfGoodsList);

    List<Map<String, Object>> selectClinicListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                         @Param("gsmGoodsTypeId") Integer gsmGoodsTypeId,
                                                         @Param("gsmGoodsName") String gsmGoodsName,
                                                         @Param("iymShelfPositionName") String iymShelfPositionName);





}
