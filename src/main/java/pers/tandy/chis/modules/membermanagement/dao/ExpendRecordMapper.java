package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.ExpendRecord;
import pers.tandy.chis.modules.membermanagement.bean.ExpendRecordExample;

public interface ExpendRecordMapper {
    long countByExample(ExpendRecordExample example);

    int deleteByExample(ExpendRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpendRecord record);

    int insertSelective(ExpendRecord record);

    List<ExpendRecord> selectByExample(ExpendRecordExample example);

    ExpendRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpendRecord record, @Param("example") ExpendRecordExample example);

    int updateByExample(@Param("record") ExpendRecord record, @Param("example") ExpendRecordExample example);

    int updateByPrimaryKeySelective(ExpendRecord record);

    int updateByPrimaryKey(ExpendRecord record);

    /******************************************************************************************************************/

    List<Map<String, Object>> selectByCriteria(@Param("creationDate") String[] creationDate,
                                               @Param("lsh") String lsh,
                                               @Param("mrmMemberName") String mrmMemberName);
}
