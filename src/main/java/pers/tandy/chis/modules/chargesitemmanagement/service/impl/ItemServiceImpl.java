package pers.tandy.chis.modules.chargesitemmanagement.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import pers.tandy.chis.modules.chargesitemmanagement.bean.Item;
import pers.tandy.chis.modules.chargesitemmanagement.bean.ItemExample;
import pers.tandy.chis.modules.chargesitemmanagement.dao.ItemMapper;
import pers.tandy.chis.modules.chargesitemmanagement.service.ItemService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/8/6 17:25
 * @Version 1.0
 */
@CacheConfig(cacheNames = "Item")
@Service
public class ItemServiceImpl implements ItemService {

    private ItemMapper itemMapper;
    @Autowired
    public void setItemMapper(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

   /* --------------------------------------------------------------------------------------------------------------- */

    @CacheEvict(key = "'billingTypeId' + #item.billingTypeId")
    @Override
    public void save(Item item) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        item.setCreatorId(user.getId());
        item.setCreationDate(new Date());
        itemMapper.insert(item);
    }

    @Caching(
            put = {
                    @CachePut(key = "#item.id")
            },
            evict = {
                    @CacheEvict(key = "'billingTypeId' + #item.billingTypeId")
            }
    )
    @Override
    public Item update(Item item) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        item.setLastUpdaterId(user.getId());
        item.setLastUpdateDate(new Date());
        itemMapper.updateByPrimaryKey(item);
        return item;
    }

    @Override
    public void updateRetailPriceByList(List<Item> itemList) {
        itemMapper.updateRetailPriceByList(itemList);
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#item.id"),
                    @CacheEvict(key = "'billingTypeId' + #item.billingTypeId")
            }
    )
    @Override
    public void cacheEvictById(Item item) {
    }

    @Caching(
            evict = {
                    @CacheEvict(key = "#item.id"),
                    @CacheEvict(key = "'billingTypeId' + #item.billingTypeId")
            }
    )
    @Override
    public Item delete(Item item) {
        itemMapper.deleteByPrimaryKey(item.getId());
        return item;
    }

    @Cacheable(key = "#id")
    @Override
    public Item getById(Integer id) {
        return itemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> getByCriteria(Integer cimItemTypeId, Boolean state, Integer itemClassifyId, Boolean discountable, String name) {
        return itemMapper.selectByCriteria(cimItemTypeId, state, itemClassifyId, discountable, name);
    }

    @Override
    public List<Map<String, Object>> getEnabledLikeByName(String name) {
        return itemMapper.selectEnabledLikeByName(name);
    }

    @Override
    public List<Map<String, Object>> getEnabledLikeByNameForPrescription(Integer cimItemTypeId, String name) {
        return itemMapper.selectEnabledLikeByNameForPrescription(cimItemTypeId, name);
    }

    @Cacheable(key = "'billingTypeId' + #billingTypeId")
    @Override
    public List<Item> getEnabledByBillingTypeId(Integer billingTypeId) {
        ItemExample example = new ItemExample();
        example.createCriteria().andBillingTypeIdEqualTo(billingTypeId).andStateEqualTo(true);
        return itemMapper.selectByExample(example);
    }
}
