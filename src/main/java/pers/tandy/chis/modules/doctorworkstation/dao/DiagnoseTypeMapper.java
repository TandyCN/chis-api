package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseType;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseTypeExample;

public interface DiagnoseTypeMapper {
    long countByExample(DiagnoseTypeExample example);

    int deleteByExample(DiagnoseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiagnoseType record);

    int insertSelective(DiagnoseType record);

    List<DiagnoseType> selectByExample(DiagnoseTypeExample example);

    DiagnoseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiagnoseType record, @Param("example") DiagnoseTypeExample example);

    int updateByExample(@Param("record") DiagnoseType record, @Param("example") DiagnoseTypeExample example);

    int updateByPrimaryKeySelective(DiagnoseType record);

    int updateByPrimaryKey(DiagnoseType record);
}