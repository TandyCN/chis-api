package pers.tandy.chis.modules.doctorworkstation.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.SellWayEnum;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.main.component.KeyUtils;
import pers.tandy.chis.modules.datareport.bean.SellRecord;
import pers.tandy.chis.modules.doctorworkstation.bean.SellPrescription;
import pers.tandy.chis.modules.doctorworkstation.bean.SellPrescriptionExample;
import pers.tandy.chis.modules.doctorworkstation.dao.SellPrescriptionMapper;
import pers.tandy.chis.modules.doctorworkstation.service.SellPrescriptionService;
import pers.tandy.chis.modules.membermanagement.service.MemberService;
import pers.tandy.chis.modules.datareport.service.SellRecordService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/12/9 16:47
 * @Version 1.0
 */
@Service
public class SellPrescriptionServiceImpl implements SellPrescriptionService {

    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    private SellPrescriptionMapper sellPrescriptionMapper;
    @Autowired
    public void setSellPrescriptionMapper(SellPrescriptionMapper sellPrescriptionMapper) {
        this.sellPrescriptionMapper = sellPrescriptionMapper;
    }

    private SellRecordService sellRecordService;
    @Autowired
    public void setSellRecordService(SellRecordService sellRecordService) {
        this.sellRecordService = sellRecordService;
    }

    private MemberService memberService;
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void saveOrUpdateToCache(String prescriptionJson) {
        // 将 JSON 解析成对应的对象集合
        List<SellPrescription> prescriptionList =
                JSONUtils.parseJsonToObject(prescriptionJson, new TypeReference<List<SellPrescription>>() {});

        // 获取一条记录
        SellPrescription sellPrescription = prescriptionList.get(0);
        if (sellPrescription == null) {
            throw new RuntimeException("未能获取处方记录");
        }

        // 初始化部分属性
        Map<String, Object> member = memberService.getByIdForTreatment(sellPrescription.getMrmMemberId()); // 获取会员
        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        String lsh = sellPrescription.getLsh(); // 初始化流水号
        int mxh = 1; // 初始化明细号

        // 判定流水号的生成方式(如果有则继续使用, 如果没有则生成一个)
        if (lsh == null || lsh.trim().equals("")) {
            lsh = KeyUtils.getLSH(user.getId());
        }

        // 赋值对应的属性
        for (SellPrescription prescription : prescriptionList) {
            prescription.setLsh(lsh); // 写入流水号
            prescription.setMxh(String.valueOf(mxh++)); // 写入明细号
            prescription.setSysClinicId(user.getSysClinicId()); // 写入机构ID
            prescription.setSysDoctorId(user.getId()); // 医生ID
            prescription.setCreationDate(new Date()); // 操作时间
            this.setMemberInfo(prescription, member); // 设置会员信息
        }

        // 将赋值后的 list 转成 JSON 保存到缓存
        prescriptionJson = JSONUtils.parseObjectToJson(prescriptionList);

        // 向缓存插入一条记录(key, lsh, prescriptionJson)
        stringRedisTemplate.opsForHash().put(this.getRedisHashKey(), lsh, prescriptionJson);

        // 生成对应的销售记录
        this.saveOrUpdateToSellRecordCache(prescriptionList);
    }

    private void saveOrUpdateToSellRecordCache(List<SellPrescription> prescriptionList) {
        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        List<SellRecord> recordList = new ArrayList<>();
        for (SellPrescription prescription : prescriptionList) {
            SellRecord record = new SellRecord();

            // record.setCreationDate(); 结账操作对其赋值
            // record.setLsh(); 结账操作对其赋值
            // record.setMxh(); 结账操作对其赋值
            record.setDwtSellPrescriptionLsh(prescription.getLsh()); // 处方流水号
            record.setSysSellWayId(SellWayEnum.PRESCRIPTION.getIndex()); // 销售方式ID
            record.setSysSellTypeId(prescription.getSysSellTypeId()); // 销售类型ID
            record.setEntityTypeId(prescription.getEntityTypeId()); // 销售实体类型ID
            record.setEntityId(prescription.getEntityId()); // 销售实体ID
            record.setRetailPrice(prescription.getRetailPrice()); // 建议零售价
            record.setActualRetailPrice(prescription.getRetailPrice()); // 实际零售价
            // record.setPurchaseTaxRate(); 前台出库操作对其赋值
            // record.setSellTaxRate(); 前台出库操作对其赋值
            record.setDiscountable(prescription.getDiscountable()); // 是否可打折
            // record.setLossable(); 前台出库操作对其赋值
            // record.setIymInventoryId(); 前台出库操作对其赋值
            // record.setPh(); 前台出库操作对其赋值
            // record.setPch(); 前台出库操作对其赋值
            record.setSplitQuantity(prescription.getSplitQuantity()); // 库存拆分数量
            record.setQuantity(prescription.getQuantity() * prescription.getFoldQuantity()); // 销售数量
            // record.setCostPrice(); 前台出库操作对其赋值
            // record.setProducedDate(); 前台出库操作对其赋值
            // record.setExpiryDate(); 前台出库操作对其赋值
            // record.setPemSupplierId(); 前台出库操作对其赋值
            // record.setIymInventoryAddId(); 前台出库操作对其赋值
            record.setMrmMemberId(prescription.getMrmMemberId()); // 会员ID
            record.setMemberDiscountRate(prescription.getMemberDiscountRate()); // 会员折扣率
            record.setSysClinicId(user.getSysClinicId()); // 机构ID
            record.setSellerId(user.getId()); // 销售人、医生 ID
            // record.setOperatorId(); 前台出库操作对其赋值
            // record.setCashierId(); 结账操作对其赋值
            // record.setPayState(); 结账操作对其赋值

            // 记录到缓存但不记录到数据库的属性
            record.setDwtSellPrescriptionDate(prescription.getCreationDate());
            record.setOid(prescription.getOid());
            record.setName(prescription.getName());
            record.setSpecs(prescription.getSpecs());
            record.setUnitsName(prescription.getUnitsName());
            record.setMrmMemberOid(prescription.getMrmMemberOid());
            record.setMrmMemberName(prescription.getMrmMemberName());
            record.setGenderName(prescription.getGenderName());
            record.setPhone(prescription.getPhone());
            record.setOnceContainQuantity(prescription.getOnceContainQuantity());
            record.setRegistrationFeeFlag(false);
            record.setSysDoctorName(prescription.getSysDoctorName());

            recordList.add(record);
        }

        sellRecordService.saveOrUpdateToCache(JSONUtils.parseObjectToJson(recordList));
    }

    @Override
    public void deleteByLshFromCache(String lsh) {
        stringRedisTemplate.opsForHash().delete(this.getRedisHashKey(), lsh);
        // 清除销售记录中对应的缓存记录
        this.sellRecordService.deleteByPrescriptionLshFromCache(lsh);
    }

    @Override
    public List<SellPrescription> getClinicDoctorGroupListByCriteriaFromCache(Integer sysDoctorId, Integer mrmMemberId, Integer sysSellTypeId, Integer entityTypeId) {
        // 从缓存中获取本机构的所有处方
        List<Object> objectList = stringRedisTemplate.opsForHash().values(this.getRedisHashKey());

        // 将获取到 List<Object> 转成 List<SellPrescription>
        List<SellPrescription> groupList = new ArrayList<>();
        for (Object o : objectList) {
            // 解析当前处方明细
            String prescriptionJson = o.toString();
            List<SellPrescription> prescriptionList =
                    JSONUtils.parseJsonToObject(prescriptionJson, new TypeReference<List<SellPrescription>>() {});

            // 获取当前解析后的处方List中一条进行过滤判断
            SellPrescription prescription = prescriptionList.get(0);
            if (
                    prescription.getSysDoctorId().intValue() == sysDoctorId.intValue() && // 符合指定医生ID
                    prescription.getMrmMemberId().intValue() == mrmMemberId.intValue() && // 符合指定会员ID
                    prescription.getSysSellTypeId().intValue() == sysSellTypeId.intValue() && // 符合指定销售类型
                    prescription.getEntityTypeId().intValue() == entityTypeId.intValue() // 符合指定处方类型
            ) {
                groupList.add(prescription);
            }
        }

        return groupList;
    }

    @Override
    public List<SellPrescription> getByLshFromCache(String lsh) {
        // 从缓存中获取目标流水号的处方
        Object o = stringRedisTemplate.opsForHash().get(this.getRedisHashKey(), lsh);
        if (o == null) {
            throw new RuntimeException("获取处方缓存失败");
        }

        // 将获取的 Object 解析 对应的处方明细 List<SellPrescription>
        String prescriptionJson = o.toString();
        return JSONUtils.parseJsonToObject(prescriptionJson, new TypeReference<List<SellPrescription>>() {});
    }

    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void saveList(List<SellPrescription> sellPrescriptionList) {
        SqlSession batchSqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        SellPrescriptionMapper mapper = batchSqlSession.getMapper(SellPrescriptionMapper.class);
        try {
            for (SellPrescription sellPrescription : sellPrescriptionList) {
                mapper.insert(sellPrescription);
            }
            batchSqlSession.commit();
        } finally {
            batchSqlSession.close();
        }
    }

    @Override
    public List<SellPrescription> getByClinicalHistoryId(Integer dwtClinicalHistoryId) {
        SellPrescriptionExample example =new SellPrescriptionExample();
        example.createCriteria().andDwtClinicalHistoryIdEqualTo(dwtClinicalHistoryId);
        example.setOrderByClause("sys_sell_type_id, entity_type_id, entity_id");
        return sellPrescriptionMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> getGroupListByCriteria(String [] creationDate, // 处方日期
                                                            String lsh, // 流水号
                                                            Integer sysClinicId, // 机构ID
                                                            Integer sysSellTypeId, // 销售类型 [商品、项目]
                                                            Integer entityTypeId, // 销售实体类型 [西药、中药、卫生材料]
                                                            Integer mrmMemberId, // 会员ID
                                                            String sysDoctorName){
        return sellPrescriptionMapper.selectGroupListByCriteria(creationDate, lsh, sysClinicId, sysSellTypeId, entityTypeId, mrmMemberId, sysDoctorName);
    }

    @Override
    public List<Map<String, Object>> getClinicListByLsh(String lsh, Integer sysClinicId) {
        return sellPrescriptionMapper.selectClinicListByLsh(lsh, sysClinicId);
    }

    @Override
    public List<Map<String, Object>> getByLshForTemplate(String lsh, Integer sysClinicId) {
        return sellPrescriptionMapper.selectByLshForTemplate(lsh, sysClinicId);
    }


}
