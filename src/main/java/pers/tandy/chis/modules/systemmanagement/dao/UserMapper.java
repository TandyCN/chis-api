package pers.tandy.chis.modules.systemmanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.systemmanagement.bean.User;
import pers.tandy.chis.modules.systemmanagement.bean.UserExample;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /* -------------------------------------------------------------------------------------------------------------- */

    List<Map<String, Object>> selectByCriteria(@Param("name") String name,
                                               @Param("sysRoleName") String sysRoleName,
                                               @Param("sysClinicName") String sysClinicName,
                                               @Param("state") Boolean state);

    List<Map<String, Object>> selectClinicEnabled(@Param("sysClinicId") Integer sysClinicId);
}
