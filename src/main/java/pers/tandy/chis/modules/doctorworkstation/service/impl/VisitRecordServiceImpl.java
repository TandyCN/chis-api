package pers.tandy.chis.modules.doctorworkstation.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.doctorworkstation.bean.VisitRecord;
import pers.tandy.chis.modules.doctorworkstation.bean.VisitRecordExample;
import pers.tandy.chis.modules.doctorworkstation.dao.VisitRecordMapper;
import pers.tandy.chis.modules.doctorworkstation.service.VisitRecordService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/1/16 22:44
 * @Version 1.0
 */
@Service
public class VisitRecordServiceImpl implements VisitRecordService {
    private VisitRecordMapper visitRecordMapper ;
    @Autowired
    public void setVisitRecordMapper(VisitRecordMapper visitRecordMapper) {
        this.visitRecordMapper = visitRecordMapper;
    }

    /* -------------------------------------------------------------------------------------------------------------- */
    @Override
    public void save(VisitRecord visitRecord) {
        if (!this.getUnfinishedByDwtClinicalHistoryId(visitRecord.getDwtClinicalHistoryId()).isEmpty()) {
            throw new RuntimeException("该病历下有回访尚未完成, 不能继续预约");
        }
        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        visitRecord.setPhase(1);
        visitRecord.setSysClinicId(user.getSysClinicId());
        visitRecord.setCreatorId(user.getId());
        visitRecord.setCreationDate(new Date());
        visitRecord.setFinished(false);
        visitRecordMapper.insert(visitRecord);
    }

    @Override
    public void update(VisitRecord visitRecord, Date nextAppointmentDate) {
        visitRecord.setFinishDate(new Date()); // 设置完成时间
        visitRecord.setFinished(true); // 设置状态未完成状态
        visitRecordMapper.updateByPrimaryKey(visitRecord);

        if (nextAppointmentDate != null) {
            visitRecord.setAppointmentDate(nextAppointmentDate);
            this.updateAfterSave(visitRecord);
        }
    }

    private void updateAfterSave(VisitRecord visitRecord) {
        VisitRecord newVisitRecord = new VisitRecord();
        newVisitRecord.setAppointmentDate(visitRecord.getAppointmentDate());
        newVisitRecord.setMrmMemberId(visitRecord.getMrmMemberId());
        newVisitRecord.setDwtClinicalHistoryId(visitRecord.getDwtClinicalHistoryId());
        newVisitRecord.setPhase(visitRecord.getPhase() + 1); // 设置阶段+1
        newVisitRecord.setSysClinicId(visitRecord.getSysClinicId());
        newVisitRecord.setCreatorId(visitRecord.getCreatorId());
        newVisitRecord.setCreationDate(new Date());
        newVisitRecord.setFinished(false);
        visitRecordMapper.insert(newVisitRecord);
    }

    @Override
    public VisitRecord getById(Integer id) {
        return visitRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<VisitRecord> getUnfinishedByDwtClinicalHistoryId(Integer dwtClinicalHistoryId) {
        VisitRecordExample example = new VisitRecordExample();
        example.createCriteria().andDwtClinicalHistoryIdEqualTo(dwtClinicalHistoryId).andFinishedEqualTo(false);
        List<VisitRecord> list = visitRecordMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer sysClinicId,
                                                   Integer creatorId,
                                                   String[] appointmentDate,
                                                   String mrmMemberName,
                                                   Boolean finished) {
        return visitRecordMapper.selectByCriteria( sysClinicId, creatorId, appointmentDate, mrmMemberName, finished);
    }
}
