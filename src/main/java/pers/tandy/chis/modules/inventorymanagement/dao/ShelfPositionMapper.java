package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfPosition;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfPositionExample;

public interface ShelfPositionMapper {
    long countByExample(ShelfPositionExample example);

    int deleteByExample(ShelfPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShelfPosition record);

    int insertSelective(ShelfPosition record);

    List<ShelfPosition> selectByExample(ShelfPositionExample example);

    ShelfPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShelfPosition record, @Param("example") ShelfPositionExample example);

    int updateByExample(@Param("record") ShelfPosition record, @Param("example") ShelfPositionExample example);

    int updateByPrimaryKeySelective(ShelfPosition record);

    int updateByPrimaryKey(ShelfPosition record);

    /* -------------------------------------------------------------------------------------------------------------- */

    List<ShelfPosition> selectClinicListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                   @Param("name") String name);
}
