package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.SecondClassify;
import pers.tandy.chis.modules.systemmanagement.bean.SecondClassifyExample;

public interface SecondClassifyMapper {
    long countByExample(SecondClassifyExample example);

    int deleteByExample(SecondClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecondClassify record);

    int insertSelective(SecondClassify record);

    List<SecondClassify> selectByExample(SecondClassifyExample example);

    SecondClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecondClassify record, @Param("example") SecondClassifyExample example);

    int updateByExample(@Param("record") SecondClassify record, @Param("example") SecondClassifyExample example);

    int updateByPrimaryKeySelective(SecondClassify record);

    int updateByPrimaryKey(SecondClassify record);


    /* -------------------------------------------------------------------------------------------------------------- */

    List<Map<String, Object>> selectByCriteria(@Param("goodsClassifyId") Integer goodsClassifyId,
                                               @Param("name") String name,
                                               @Param("state") Boolean state);

    List<Map<String, Object>> selectEnabledByGoodsClassifyId(@Param("goodsClassifyId") Integer goodsClassifyId);


}
