package pers.tandy.chis.modules.chargesitemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemApply;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemApplyExample;

public interface ItemApplyMapper {
    long countByExample(ItemApplyExample example);

    int deleteByExample(ItemApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemApply record);

    int insertSelective(ItemApply record);

    List<ItemApply> selectByExample(ItemApplyExample example);

    ItemApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemApply record, @Param("example") ItemApplyExample example);

    int updateByExample(@Param("record") ItemApply record, @Param("example") ItemApplyExample example);

    int updateByPrimaryKeySelective(ItemApply record);

    int updateByPrimaryKey(ItemApply record);

    /*----------------------------------------------------------------------------------------------------------------*/

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("approveState") Byte approveState,
                                               @Param("name") String name);
}
