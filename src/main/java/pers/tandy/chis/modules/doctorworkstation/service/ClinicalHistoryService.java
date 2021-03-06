package pers.tandy.chis.modules.doctorworkstation.service;

import org.springframework.transaction.annotation.Transactional;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistory;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/11/16 12:48
 * @Version 1.0
 */
public interface ClinicalHistoryService {

    /**
     * 保存操作 返回 ID
     * useGeneratedKeys="true"
     * keyProperty="id" POJO 属性主键名称
     * keyColumn="id" 数据表主键名称
     * @param clinicalHistory
     * @return
     */
    @Transactional
    ClinicalHistory save(ClinicalHistory clinicalHistory);

    /**
     * 修改操作
     * @param clinicalHistory
     * @return
     */
    @Transactional
    ClinicalHistory update(ClinicalHistory clinicalHistory);

    /**
     * 根据 ID 修改归档状态
     * @param finished
     * @param id
     */
    @Transactional
    void updateFinishedById(Boolean finished, Integer id);

    /**
     * 根据主键获取对象
     * @param id
     * @return
     */
    ClinicalHistory getById(Integer id);

    /**
     * 根据查询条件获取病例集合
     * @param creationDate
     * @param mrmMemberId
     * @param dwtDiagnoseTypeId
     * @return
     */
    List<Map<String, Object>> getByCriteria(String[] creationDate, Integer mrmMemberId, Integer dwtDiagnoseTypeId);

    /**
     * 获取未最近一个归档的病例
     * @param mrmMemberId
     * @param sysDoctorId
     * @return
     */
    Map<String, Object> getLastUnfinishedByCriteria(Integer mrmMemberId, Integer sysDoctorId);
}
