package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.PointsRecord;
import pers.tandy.chis.modules.membermanagement.bean.PointsRecordExample;

public interface PointsRecordMapper {
    long countByExample(PointsRecordExample example);

    int deleteByExample(PointsRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PointsRecord record);

    int insertSelective(PointsRecord record);

    List<PointsRecord> selectByExample(PointsRecordExample example);

    PointsRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PointsRecord record, @Param("example") PointsRecordExample example);

    int updateByExample(@Param("record") PointsRecord record, @Param("example") PointsRecordExample example);

    int updateByPrimaryKeySelective(PointsRecord record);

    int updateByPrimaryKey(PointsRecord record);


    /******************************************************************************************************************/

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("lsh") String lsh,
                                               @Param("mrmMemberName") String mrmMemberName);

    Integer selectSumGivenPointsByLsh(@Param("lsh") String lsh);
}
