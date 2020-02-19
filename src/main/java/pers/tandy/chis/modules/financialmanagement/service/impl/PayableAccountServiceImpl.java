package pers.tandy.chis.modules.financialmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.financialmanagement.bean.PayableAccount;
import pers.tandy.chis.modules.financialmanagement.dao.PayableAccountMapper;
import pers.tandy.chis.modules.financialmanagement.service.PayableAccountService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/2/16 19:56
 * @Version 1.0
 */
@Service
public class PayableAccountServiceImpl implements PayableAccountService {

    private PayableAccountMapper payableAccountMapper;

    @Autowired
    public void setPayableAccountMapper(PayableAccountMapper payableAccountMapper) {
        this.payableAccountMapper = payableAccountMapper;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void save(PayableAccount payableAccount) {
       payableAccountMapper.insert(payableAccount);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(String[] creationDate, Integer pemSupplierId, Integer sysClinicId, Boolean payUp) {
        return payableAccountMapper.selectByCriteria(creationDate, pemSupplierId, sysClinicId, payUp);
    }
}
