package pers.tandy.chis.modules.datareport.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import pers.tandy.chis.main.common.enums.SellTypeEnum;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.modules.datareport.bean.SellRecord;
import pers.tandy.chis.modules.datareport.dao.SellRecordMapper;
import pers.tandy.chis.modules.datareport.service.SellRecordService;

import java.util.*;

/**
 * @Author: Tandy
 * @Date: 2019/12/11 15:01
 * @Version 1.0
 */
@Service
public class SellRecordServiceImpl implements SellRecordService {
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    private SellRecordMapper sellRecordMapper;
    @Autowired
    public void setSellRecordMapper(SellRecordMapper sellRecordMapper) {
        this.sellRecordMapper = sellRecordMapper;
    }

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    /* -------------------------------------------------------------------------------------------------------------- */

    @Override
    public void saveOrUpdateToCache(String recordJson) {
        // 将 JSON 解析成对应的对象集合
        List<SellRecord> recordList =
                JSONUtils.parseJsonToObject(recordJson, new TypeReference<List<SellRecord>>() {});

        // 获取处方流水号
        String prescriptionLsh = recordList.get(0).getDwtSellPrescriptionLsh();

        if (prescriptionLsh == null) {
            throw new RuntimeException("未能获取处方流水号");
        }

        // 将赋值后的 list 转成 JSON 保存到缓存 保存格式为(key, prescriptionLsh, recordJson)
        recordJson = JSONUtils.parseObjectToJson(recordList);
        stringRedisTemplate.opsForHash().put(this.getRedisHashKey(), prescriptionLsh, recordJson);

    }

    @Override
    public void deleteByPrescriptionLshFromCache(String prescriptionLsh) {
        stringRedisTemplate.opsForHash().delete(this.getRedisHashKey(), prescriptionLsh);
    }

    @Override
    public List<SellRecord> getClinicMemberGroupListFromCache() {
        // 获取对应机构所有的销售记录
        List<Object> objectList = stringRedisTemplate.opsForHash().values(this.getRedisHashKey());

        // 将List<Object> 解析成 List<SellRecord>
        List<SellRecord> sellRecordList = new ArrayList<>();
        for (Object o : objectList) {
            String recordJson = o.toString();
            List<SellRecord> recordList =
                    JSONUtils.parseJsonToObject(recordJson, new TypeReference<List<SellRecord>>() {});
            sellRecordList.addAll(recordList);
        }

        // 对 List<SellRecord> 进行排序
        sellRecordList = this.sellRecordListSort(sellRecordList);

        // 通过 map 按会员 id 进行汇总
        Map<Integer, SellRecord> groupMap = new HashMap<>();
        for (SellRecord sellRecord : sellRecordList) {
            groupMap.putIfAbsent(sellRecord.getMrmMemberId(), sellRecord);
        }

        // 返回数据
        List<SellRecord> groupList = new ArrayList<>(groupMap.values());
        return this.sellRecordListSort(groupList);
    }

    @Override
    public List<SellRecord> getClinicListByMrmMemberIdFromCache(Integer mrmMemberId) {
        // 获取对应机构所有的销售记录
        List<Object> objectList = stringRedisTemplate.opsForHash().values(this.getRedisHashKey());

        // 将List<Object> 解析成 List<SellRecord> 并过滤对应会员记录
        List<SellRecord> detailList = new ArrayList<>();
        for (Object o : objectList) {
            String recordJson = o.toString();
            List<SellRecord> recordList =
                    JSONUtils.parseJsonToObject(recordJson, new TypeReference<List<SellRecord>>() {});

            // 过滤对应会员对应记录并进行封装
            if (recordList.get(0).getMrmMemberId().intValue() == mrmMemberId.intValue()) {
                detailList.addAll(recordList);
            }
        }

        // 返回数据
        return this.sellRecordListSort(detailList);
    }

    @Override
    public List<SellRecord> getClinicDrugsPrescriptionGroupListFromCache() {
        // 获取对应机构所有的销售记录
        List<Object> objectList = stringRedisTemplate.opsForHash().values(this.getRedisHashKey());

        // 将List<Object> 解析成 List<SellRecord> 并进行汇总
        List<SellRecord> groupList = new ArrayList<>();
        for (Object o : objectList) {
            String recordJson = o.toString();
            List<SellRecord> recordList =
                    JSONUtils.parseJsonToObject(recordJson, new TypeReference<List<SellRecord>>() {});

            // 通过 Map 去掉重复, 封装汇总数据
            SellRecord record = recordList.get(0);
            if (record.getSysSellTypeId().intValue() == SellTypeEnum.GOODS.getIndex()) {
                groupList.add(record);
            }
        }

        // 返回数据
        return this.sellRecordListSort(groupList);
    }

    @Override
    public List<SellRecord> getClinicListByPrescriptionLshFromCache(String prescriptionLsh) {
        // 从缓存中获取对应流水号 JSON
        Object o = stringRedisTemplate.opsForHash().get(this.getRedisHashKey(), prescriptionLsh);
        if (o == null) {
            throw new RuntimeException("获取销售记录缓存失败");
        }

        // 将获取的 Object 解析 对应的处方明细 List<SellRecord>
        String recordJson = o.toString();
        List<SellRecord> recordList =
                JSONUtils.parseJsonToObject(recordJson, new TypeReference<List<SellRecord>>() {});

        return this.sellRecordListSort(recordList);
    }

    @Override
    public void saveList(List<SellRecord> sellRecordList) {
        SqlSession batchSqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        SellRecordMapper mapper = batchSqlSession.getMapper(SellRecordMapper.class);
        try {
            for (SellRecord sellRecord : sellRecordList) {
                mapper.insert(sellRecord);
            }
            batchSqlSession.commit();
        } finally {
            batchSqlSession.close();
        }
    }

    @Override
    public void updateReturnedByIdList(List<Integer> idList) {
        sellRecordMapper.updateReturnedByIdList(idList);
    }

    @Override
    public void updateInvoiceByIdList(List<Integer> idList, Integer invoiceTypeId, String invoiceNo) {
        sellRecordMapper.updateInvoiceByIdList(idList, invoiceTypeId, invoiceNo);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer sysClinicId, String[] creationDate, String lsh, String sellerName) {
        return sellRecordMapper.selectByCriteria(sysClinicId, creationDate, lsh, sellerName);
    }

    @Override
    public List<Map<String, Object>> getClinicGroupListByCriteria(Integer sysClinicId, String[] creationDate, String lsh, String mrmMemberName) {
        return sellRecordMapper.selectClinicGroupListByCriteria(sysClinicId, creationDate, lsh, mrmMemberName);
    }

    @Override
    public List<Map<String, Object>> getClinicUnreturnedListByLsh(Integer sysClinicId, String lsh) {
        return sellRecordMapper.selectClinicUnreturnedListByLsh(sysClinicId, lsh);
    }

    @Override
    public List<Map<String, Object>> getClinicListByLsh(Integer sysClinicId, String lsh) {
        return sellRecordMapper.selectClinicListByLsh(sysClinicId, lsh);
    }


}
