package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistoryTemplate;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistoryTemplateExample;

public interface ClinicalHistoryTemplateMapper {
    long countByExample(ClinicalHistoryTemplateExample example);

    int deleteByExample(ClinicalHistoryTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClinicalHistoryTemplate record);

    int insertSelective(ClinicalHistoryTemplate record);

    List<ClinicalHistoryTemplate> selectByExample(ClinicalHistoryTemplateExample example);

    ClinicalHistoryTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClinicalHistoryTemplate record, @Param("example") ClinicalHistoryTemplateExample example);

    int updateByExample(@Param("record") ClinicalHistoryTemplate record, @Param("example") ClinicalHistoryTemplateExample example);

    int updateByPrimaryKeySelective(ClinicalHistoryTemplate record);

    int updateByPrimaryKey(ClinicalHistoryTemplate record);

    /* -------------------------------------------------------------------------------------------------------------- */

    List<Map<String, Object>> selectByCriteria(@Param("sysDoctorId") Integer sysDoctorId,
                                               @Param("dwtDiagnoseTypeId") Integer dwtDiagnoseTypeId,
                                               @Param("shareState") Boolean shareState,
                                               @Param("name") String name);
}
