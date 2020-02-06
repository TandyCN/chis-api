package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseClassify;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseClassifyExample;

public interface DiagnoseClassifyMapper {
    long countByExample(DiagnoseClassifyExample example);

    int deleteByExample(DiagnoseClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiagnoseClassify record);

    int insertSelective(DiagnoseClassify record);

    List<DiagnoseClassify> selectByExample(DiagnoseClassifyExample example);

    DiagnoseClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiagnoseClassify record, @Param("example") DiagnoseClassifyExample example);

    int updateByExample(@Param("record") DiagnoseClassify record, @Param("example") DiagnoseClassifyExample example);

    int updateByPrimaryKeySelective(DiagnoseClassify record);

    int updateByPrimaryKey(DiagnoseClassify record);
}