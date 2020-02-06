package pers.tandy.chis.modules.membermanagement.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pers.tandy.chis.modules.membermanagement.bean.Member;
import pers.tandy.chis.modules.membermanagement.bean.MemberExample;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    /* -------------------------------------------------------------------------------------------------------------- */

    void updateBalanceAndPoints(@Param("id") Integer id, @Param("balance") Float balance, @Param("points") Integer points);

    void updateBalanceForDeposit(@Param("id") Integer id, @Param("balance") Float balance);

    List<Map<String, Object>> selectByCriteria(@Param("mrmMemberId") Integer mrmMemberId,
                                               @Param("name") String name,
                                               @Param("phone") String phone,
                                               @Param("idCardNo") String idCardNo,
                                               @Param("state") Boolean state,
                                               @Param("healthState") String healthState,
                                               @Param("exposureId") Integer exposureId,
                                               @Param("allergyId") Integer allergyId,
                                               @Param("disabilityId") Integer disabilityId,
                                               @Param("previousIdList") List<Integer> previousIdList,
                                               @Param("familyIdList") List<Integer> familyIdList);

    List<Map<String, Object>> selectEnabledLikeByKeyword(@Param("keyword") String keyword);

    Map<String, Object> selectLastMemberMapByCommitteeId(@Param("mrmCommitteeId") Integer mrmCommitteeId);
}
