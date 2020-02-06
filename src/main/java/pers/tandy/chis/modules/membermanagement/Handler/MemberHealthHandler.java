package pers.tandy.chis.modules.membermanagement.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.modules.membermanagement.bean.MemberHealth;
import pers.tandy.chis.modules.membermanagement.service.MemberHealthService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/10/24 15:44
 * @Version 1.0
 */
@RequestMapping("/memberHealth")
@RestController
public class MemberHealthHandler {

    private MemberHealthService memberHealthService;
    @Autowired
    public void setMemberHealthService(MemberHealthService memberHealthService) {
        this.memberHealthService = memberHealthService;
    }

    /**
     * 根据会员ID 获取对应的健康档案信息
     * @param mrmMemberId
     * @return
     */
    @GetMapping("/getByMrmMemberId")
    public List<MemberHealth> getByMrmMemberId(Integer mrmMemberId) {
        return memberHealthService.getByMrmMemberId(mrmMemberId);
    }


}
