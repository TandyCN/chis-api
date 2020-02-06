package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.CommonDiagnose;
import pers.tandy.chis.modules.doctorworkstation.bean.CommonDiagnoseExample;

public interface CommonDiagnoseMapper {
    long countByExample(CommonDiagnoseExample example);

    int deleteByExample(CommonDiagnoseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonDiagnose record);

    int insertSelective(CommonDiagnose record);

    List<CommonDiagnose> selectByExample(CommonDiagnoseExample example);

    CommonDiagnose selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonDiagnose record, @Param("example") CommonDiagnoseExample example);

    int updateByExample(@Param("record") CommonDiagnose record, @Param("example") CommonDiagnoseExample example);

    int updateByPrimaryKeySelective(CommonDiagnose record);

    int updateByPrimaryKey(CommonDiagnose record);

    /* -------------------------------------------------------------------------------------------------------------- */
    List<Map<String, Object>> selectByCriteria(@Param("creatorId") Integer creatorId,
                                               @Param("dwtDiagnoseTypeId") Integer dwtDiagnoseTypeId,
                                               @Param("shareState") Boolean shareState,
                                               @Param("name") String name);

    List<CommonDiagnose> selectLikeByName(@Param("dwtDiagnoseTypeId") Integer dwtDiagnoseTypeId,
                                          @Param("name") String name);




}
