package pers.tandy.chis.modules.systemmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.systemmanagement.bean.PaymentWay;
import pers.tandy.chis.modules.systemmanagement.bean.PaymentWayExample;
import pers.tandy.chis.modules.systemmanagement.dao.PaymentWayMapper;
import pers.tandy.chis.modules.systemmanagement.service.PaymentWayService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/12/14 10:48
 * @Version 1.0
 */
@CacheConfig(cacheNames = "PaymentWay")
@Service
public class PaymentWayServiceImpl implements PaymentWayService {
    private PaymentWayMapper paymentWayMapper;
    @Autowired
    public void setPaymentWayMapper(PaymentWayMapper paymentWayMapper) {
        this.paymentWayMapper = paymentWayMapper;
    }

    @CacheEvict(key = "'enabled'")
    @Override
    public void save(PaymentWay paymentWay) {
        paymentWayMapper.insert(paymentWay);
    }

    @Caching(
            put = {
                    @CachePut(key = "#paymentWay.id")
            },
            evict = {
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public PaymentWay update(PaymentWay paymentWay) {
        paymentWayMapper.updateByPrimaryKey(paymentWay);
        return paymentWay;
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#id"),
                    @CacheEvict(key = "'enabled'")
            }
    )
    @Override
    public void delete(Integer id) {
        paymentWayMapper.deleteByPrimaryKey(id);
    }

    @Cacheable(key = "#id")
    @Override
    public PaymentWay getById(Integer id) {
        return paymentWayMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PaymentWay> getByCriteria(String name, Boolean state) {
        PaymentWayExample example = new PaymentWayExample();
        PaymentWayExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(name + "%");
        PaymentWayExample.Criteria criteria2 = example.createCriteria();
        criteria2.andCodeLike(name + "%");
        if(state != null) {
            criteria.andStateEqualTo(state);
            criteria2.andStateEqualTo(state);
        }
        example.or(criteria2);
        example.setOrderByClause("id DESC");
        return paymentWayMapper.selectByExample(example);
    }

    @Cacheable(key = "'enabled'")
    @Override
    public List<PaymentWay> getEnabled() {
        PaymentWayExample example = new PaymentWayExample();
        example.createCriteria().andStateEqualTo(true);
        return paymentWayMapper.selectByExample(example);
    }
}
