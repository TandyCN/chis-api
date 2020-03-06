package pers.tandy.chis.modules.doctorworkstation.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.doctorworkstation.bean.SellPrescription;
import pers.tandy.chis.modules.doctorworkstation.bean.SellPrescriptionExample;

public interface SellPrescriptionMapper {
    long countByExample(SellPrescriptionExample example);

    int deleteByExample(SellPrescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellPrescription record);

    int insertSelective(SellPrescription record);

    List<SellPrescription> selectByExample(SellPrescriptionExample example);

    SellPrescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellPrescription record, @Param("example") SellPrescriptionExample example);

    int updateByExample(@Param("record") SellPrescription record, @Param("example") SellPrescriptionExample example);

    int updateByPrimaryKeySelective(SellPrescription record);

    int updateByPrimaryKey(SellPrescription record);

    /******************************************************************************************************************/

    // void insertList(@Param("sellPrescriptionList") List<SellPrescription> sellPrescriptionList);

    List<Map<String, Object>> selectGroupListByCriteria(@Param("creationDate") String[] creationDate, // 处方日期
                                                        @Param("lsh") String lsh, // 流水号
                                                        @Param("sysClinicId") Integer sysClinicId, // 机构ID
                                                        @Param("sysSellTypeId") Integer sysSellTypeId, // 销售类型 [商品、项目]
                                                        @Param("entityTypeId") Integer entityTypeId, // 销售实体类型 [西药、中药、卫生材料]
                                                        @Param("mrmMemberId") Integer mrmMemberId, // 会员ID
                                                        @Param("sysDoctorName") String sysDoctorName); // 处方医生姓名

    List<Map<String, Object>> selectClinicListByLsh(@Param("lsh") String lsh,
                                                    @Param("sysClinicId") Integer sysClinicId);

    List<Map<String, Object>> selectByLshForTemplate(@Param("lsh") String lsh,
                                                     @Param("sysClinicId") Integer sysClinicId);
}
