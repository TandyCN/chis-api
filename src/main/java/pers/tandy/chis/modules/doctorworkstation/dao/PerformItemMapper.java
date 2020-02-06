package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItem;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItemExample;

public interface PerformItemMapper {
    long countByExample(PerformItemExample example);

    int deleteByExample(PerformItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerformItem record);

    int insertSelective(PerformItem record);

    List<PerformItem> selectByExample(PerformItemExample example);

    PerformItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerformItem record, @Param("example") PerformItemExample example);

    int updateByExample(@Param("record") PerformItem record, @Param("example") PerformItemExample example);

    int updateByPrimaryKeySelective(PerformItem record);

    int updateByPrimaryKey(PerformItem record);

    /******************************************************************************************************************/

    void insertList(@Param("performItemList") List<PerformItem> performItemList);

    void updateResidueQuantityById(@Param("id") Integer id, @Param("performQuantity") Integer performQuantity);

    void updateResidueQuantityByList(@Param("performItemList") List<PerformItem> performItemList);

    void resetResidueQuantityByList(@Param("performItemList") List<PerformItem> performItemList);

    List<Map<String, Object>> selectByCriteria(@Param("mrmMemberId") Integer mrmMemberId,
                                               @Param("cimItemName") String cimItemName,
                                               @Param("showZero") Boolean showZero);


}
