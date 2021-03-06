package pers.tandy.chis.modules.membermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.membermanagement.bean.ExpendRecord;
import pers.tandy.chis.modules.membermanagement.dao.ExpendRecordMapper;
import pers.tandy.chis.modules.membermanagement.service.ExpendRecordService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/12/23 17:43
 * @Version 1.0
 */
@Service
public class ExpendRecordServiceImpl implements ExpendRecordService {

    private ExpendRecordMapper expendRecordMapper;
    @Autowired
    public void setExpendRecordMapper(ExpendRecordMapper expendRecordMapper) {
        this.expendRecordMapper = expendRecordMapper;
    }

    @Override
    public void save(ExpendRecord expendRecord) {
        expendRecordMapper.insert(expendRecord);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(String[] creationDate, String lsh, String mrmMemberName) {
        return expendRecordMapper.selectByCriteria(creationDate, lsh, mrmMemberName);
    }
}
