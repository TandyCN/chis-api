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
    public void saveList(List<PayableAccount> payableAccountList) {
        payableAccountMapper.saveList(payableAccountList);
    }

    @Override
    public List<Map<String, Object>> getGroupListByCriteria(String[] creationDate, Integer pemSupplierId, Integer sysClinicId, Float arrearagesAmount) {
        return payableAccountMapper.selectGroupListByCriteria(creationDate, pemSupplierId, sysClinicId, arrearagesAmount);
    }

    @Override
    public List<Map<String, Object>> getByLsh(String lsh) {
        return payableAccountMapper.selectByLsh(lsh);
    }

}
