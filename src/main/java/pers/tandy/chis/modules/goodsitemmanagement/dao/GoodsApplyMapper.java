package pers.tandy.chis.modules.goodsitemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsApply;
import pers.tandy.chis.modules.goodsitemmanagement.bean.GoodsApplyExample;

public interface GoodsApplyMapper {
    long countByExample(GoodsApplyExample example);

    int deleteByExample(GoodsApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsApply record);

    int insertSelective(GoodsApply record);

    List<GoodsApply> selectByExample(GoodsApplyExample example);

    GoodsApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsApply record, @Param("example") GoodsApplyExample example);

    int updateByExample(@Param("record") GoodsApply record, @Param("example") GoodsApplyExample example);

    int updateByPrimaryKeySelective(GoodsApply record);

    int updateByPrimaryKey(GoodsApply record);

    /*----------------------------------------------------------------------------------------------------------------*/

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("approveState") Byte approveState,
                                               @Param("name") String name);
}
