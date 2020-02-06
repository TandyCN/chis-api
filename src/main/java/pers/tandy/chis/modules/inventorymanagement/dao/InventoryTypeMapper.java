package pers.tandy.chis.modules.inventorymanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryType;
import pers.tandy.chis.modules.inventorymanagement.bean.InventoryTypeExample;

public interface InventoryTypeMapper {
    long countByExample(InventoryTypeExample example);

    int deleteByExample(InventoryTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InventoryType record);

    int insertSelective(InventoryType record);

    List<InventoryType> selectByExample(InventoryTypeExample example);

    InventoryType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InventoryType record, @Param("example") InventoryTypeExample example);

    int updateByExample(@Param("record") InventoryType record, @Param("example") InventoryTypeExample example);

    int updateByPrimaryKeySelective(InventoryType record);

    int updateByPrimaryKey(InventoryType record);
}