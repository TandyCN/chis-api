package pers.tandy.chis.modules.nurseworkstation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.nurseworkstation.bean.PaymentRecord;
import pers.tandy.chis.modules.nurseworkstation.bean.PaymentRecordExample;
import pers.tandy.chis.modules.nurseworkstation.dao.PaymentRecordMapper;
import pers.tandy.chis.modules.nurseworkstation.service.PaymentRecordService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/12/23 15:11
 * @Version 1.0
 */
@Service
public class PaymentRecordServiceImpl implements PaymentRecordService {

    private PaymentRecordMapper paymentRecordMapper;
    @Autowired
    public void setPaymentRecordMapper(PaymentRecordMapper paymentRecordMapper) {
        this.paymentRecordMapper = paymentRecordMapper;
    }

    @Override
    public void save(PaymentRecord paymentRecord) {
        paymentRecordMapper.insert(paymentRecord);
    }

    @Override
    public List<PaymentRecord> getByLsh(String lsh) {
        PaymentRecordExample example = new PaymentRecordExample();
        example.createCriteria().andLshEqualTo(lsh);
        return paymentRecordMapper.selectByExample(example);
    }

    @Override
    public Map<String, Object> getClinicGroupByLsh(Integer sysClinicId, String lsh) {
        return this.paymentRecordMapper.selectClinicGroupByLsh(sysClinicId, lsh);
    }

    @Override
    public List<Map<String, Object>> getClinicListByCriteria(String[] creationDate, Integer sysClinicId, String lsh, String creatorName) {
        return paymentRecordMapper.selectClinicListByCriteria(creationDate, sysClinicId, lsh, creatorName);
    }

}
