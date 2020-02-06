package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseLibrary;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseLibraryExample;

public interface DiagnoseLibraryMapper {
    long countByExample(DiagnoseLibraryExample example);

    int deleteByExample(DiagnoseLibraryExample example);

    int deleteByPrimaryKey(String oid);

    int insert(DiagnoseLibrary record);

    int insertSelective(DiagnoseLibrary record);

    List<DiagnoseLibrary> selectByExample(DiagnoseLibraryExample example);

    DiagnoseLibrary selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") DiagnoseLibrary record, @Param("example") DiagnoseLibraryExample example);

    int updateByExample(@Param("record") DiagnoseLibrary record, @Param("example") DiagnoseLibraryExample example);

    int updateByPrimaryKeySelective(DiagnoseLibrary record);

    int updateByPrimaryKey(DiagnoseLibrary record);

    /* -------------------------------------------------------------------------------------------------------------- */
    List<Map<String, Object>> selectByCriteria(@Param("dwtDiagnoseTypeId") Integer dwtDiagnoseTypeId,
                                               @Param("dwtDiagnoseClassifyId") Integer dwtDiagnoseClassifyId,
                                               @Param("name") String name);











}
