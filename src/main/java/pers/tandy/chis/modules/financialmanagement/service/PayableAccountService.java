package pers.tandy.chis.modules.financialmanagement.service;

import org.springframework.transaction.annotation.Transactional;
import pers.tandy.chis.modules.financialmanagement.bean.PayableAccount;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/2/16 19:55
 * @Version 1.0
 */
public interface PayableAccountService {

    /**
     * 保存操作
     * @param payableAccount
     */
    @Transactional
    void save(PayableAccount payableAccount);

    /**
     * 根据
     * @param creationDate
     * @param pemSupplierId
     * @param sysClinicId
     * @param payUp
     * @return
     */
    List<Map<String, Object>> getByCriteria(String[] creationDate,
                                            Integer pemSupplierId,
                                            Integer sysClinicId,
                                            Boolean payUp);
}
