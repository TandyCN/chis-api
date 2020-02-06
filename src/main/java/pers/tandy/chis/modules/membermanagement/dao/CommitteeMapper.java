package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.Committee;
import pers.tandy.chis.modules.membermanagement.bean.CommitteeExample;

public interface CommitteeMapper {
    long countByExample(CommitteeExample example);

    int deleteByExample(CommitteeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Committee record);

    int insertSelective(Committee record);

    List<Committee> selectByExample(CommitteeExample example);

    Committee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Committee record, @Param("example") CommitteeExample example);

    int updateByExample(@Param("record") Committee record, @Param("example") CommitteeExample example);

    int updateByPrimaryKeySelective(Committee record);

    int updateByPrimaryKey(Committee record);

    /* -------------------------------------------------------------------------------------------------------------- */

    Short selectMaxTypeNoByCriteria(@Param("typeId") Byte typeId,
                                    @Param("mrmTownshipId") Integer mrmTownshipId);

    List<Map<String, Object>> selectByCriteria(@Param("mrmTownshipName") String mrmTownshipName,
                                               @Param("name") String name);

    List<Map<String, Object>> selectByMrmTownshipId(@Param("mrmTownshipId") Integer mrmTownshipId);

    Map<String, Object> selectCommitteeMapById(@Param("id") Integer id);




}
