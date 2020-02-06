package pers.tandy.chis.modules.doctorworkstation.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItem;
import pers.tandy.chis.modules.doctorworkstation.bean.PerformItemRecord;
import pers.tandy.chis.modules.doctorworkstation.dao.PerformItemMapper;
import pers.tandy.chis.modules.doctorworkstation.service.PerformItemRecordService;
import pers.tandy.chis.modules.doctorworkstation.service.PerformItemService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/12/26 14:30
 * @Version 1.0
 */
@Service
public class PerformItemServiceImpl implements PerformItemService {

    private PerformItemMapper performItemMapper;
    @Autowired
    public void setPerformItemMapper(PerformItemMapper performItemMapper) {
        this.performItemMapper = performItemMapper;
    }

    private PerformItemRecordService performItemRecordService;
    @Autowired
    public void setPerformItemRecordService(PerformItemRecordService performItemRecordService) {
        this.performItemRecordService = performItemRecordService;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void saveList(List<PerformItem> performItemList) {
        performItemMapper.insertList(performItemList);
    }

    @Override
    public void updateResidueQuantityById(Integer id, Integer performQuantity) {
        try {
            performItemMapper.updateResidueQuantityById(id, performQuantity);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("剩余次数不足");
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        String lsh = KeyUtils.getLSH(user.getId());

        // 创建一条执行操作记录
        PerformItemRecord record = new PerformItemRecord();
        record.setLsh(lsh);
        record.setDwtPerformItemId(id);
        record.setPerformQuantity(performQuantity);
        record.setResidueQuantity(0); // 该字段暂时不使用
        record.setSysClinicId(user.getSysClinicId());
        record.setOperatorId(user.getId());
        record.setCreationDate(new Date());

        // 保存记录
        this.performItemRecordService.save(record);
    }

    @Override
    public void updateResidueQuantityByList(List<PerformItem> performItemList) {
        try {
            performItemMapper.updateResidueQuantityByList(performItemList);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("收费项目剩余次数不足");
        }
    }

    @Override
    public void resetResidueQuantityByList(List<PerformItem> performItemList) {
        performItemMapper.resetResidueQuantityByList(performItemList);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer mrmMemberId, String cimItemName, Boolean showZero) {
        return performItemMapper.selectByCriteria(mrmMemberId, cimItemName, showZero);
    }

}
