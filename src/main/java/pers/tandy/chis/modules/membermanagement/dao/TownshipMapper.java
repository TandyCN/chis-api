package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.Township;
import pers.tandy.chis.modules.membermanagement.bean.TownshipExample;

public interface TownshipMapper {
    long countByExample(TownshipExample example);

    int deleteByExample(TownshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Township record);

    int insertSelective(Township record);

    List<Township> selectByExample(TownshipExample example);

    Township selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Township record, @Param("example") TownshipExample example);

    int updateByExample(@Param("record") Township record, @Param("example") TownshipExample example);

    int updateByPrimaryKeySelective(Township record);

    int updateByPrimaryKey(Township record);

    /* -------------------------------------------------------------------------------------------------------------- */

    Short selectMaxTypeNoByCriteria(@Param("typeId") Byte typeId,
                                    @Param("sysLocationId") Integer sysLocationId);

    List<Map<String, Object>> selectByCriteria(@Param("name") String name);

    List<Map<String, Object>> selectAll();



}
