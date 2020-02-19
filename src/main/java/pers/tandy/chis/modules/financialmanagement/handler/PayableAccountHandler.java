package pers.tandy.chis.modules.financialmanagement.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.modules.financialmanagement.service.PayableAccountService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/2/16 21:21
 * @Version 1.0
 */
@RequestMapping("/payableAccount")
@RestController
public class PayableAccountHandler {

    private PayableAccountService payableAccountService;

    @Autowired
    public void setPayableAccountService(PayableAccountService payableAccountService) {
        this.payableAccountService = payableAccountService;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    /**
     * 根据条件获取对应的应付账款明细
     * @param pageNum
     * @param pageSize
     * @param creationDate
     * @param pemSupplierId
     * @param sysClinicId
     * @param payUp
     * @return
     */
    @GetMapping("/getByCriteria")
    public PageResult getByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(value = "creationDate[]",required = false) String[] creationDate, // 创建日期
            @RequestParam(required = false) Integer pemSupplierId,
            @RequestParam(required = false) Integer sysClinicId,
            @RequestParam(required = false) Boolean payUp){

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList = payableAccountService.getByCriteria(creationDate, pemSupplierId, sysClinicId, payUp);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }


}
