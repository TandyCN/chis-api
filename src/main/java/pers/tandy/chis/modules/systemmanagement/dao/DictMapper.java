package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.Dict;
import pers.tandy.chis.modules.systemmanagement.bean.DictExample;

public interface DictMapper {
    long countByExample(DictExample example);

    int deleteByExample(DictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    int insertSelective(Dict record);

    List<Dict> selectByExample(DictExample example);

    Dict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByExample(@Param("record") Dict record, @Param("example") DictExample example);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

    /******************************************************************************************************************/

    List<Dict> selectByCriteria(@Param("name") String name,
                                @Param("sysDictTypeId") Integer sysDictTypeId,
                                @Param("state") Boolean state);

    List<Dict> selectEnabledLikeByName(@Param("sysDictTypeId") Integer sysDictTypeId,
                                       @Param("name") String name);

}
