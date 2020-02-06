package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.ClinicRoom;
import pers.tandy.chis.modules.systemmanagement.bean.ClinicRoomExample;

public interface ClinicRoomMapper {
    long countByExample(ClinicRoomExample example);

    int deleteByExample(ClinicRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClinicRoom record);

    int insertSelective(ClinicRoom record);

    List<ClinicRoom> selectByExample(ClinicRoomExample example);

    ClinicRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClinicRoom record, @Param("example") ClinicRoomExample example);

    int updateByExample(@Param("record") ClinicRoom record, @Param("example") ClinicRoomExample example);

    int updateByPrimaryKeySelective(ClinicRoom record);

    int updateByPrimaryKey(ClinicRoom record);

    /* -------------------------------------------------------------------------------------------------------------- */
    List<ClinicRoom> selectClinicListByCriteria(@Param("sysClinicId") Integer sysClinicId,
                                                @Param("name") String name);



}
