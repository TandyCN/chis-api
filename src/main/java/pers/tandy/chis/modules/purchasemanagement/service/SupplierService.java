package pers.tandy.chis.modules.purchasemanagement.service;

import org.springframework.transaction.annotation.Transactional;
import pers.tandy.chis.modules.purchasemanagement.bean.Supplier;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/8/23 15:58
 * @Version 1.0
 */
public interface SupplierService {

    /**
     * 保存操作
     * @param supplier
     */
    @Transactional
    void save(Supplier supplier);

    /**
     * 编辑操作
     * @param supplier
     * @return
     */
    @Transactional
    Supplier update(Supplier supplier);

    /**
     * 删除操作
     * @param supplier
     * @return
     */
    @Transactional
    Supplier delete(Supplier supplier);

    /**
     * 根据主键 ID 获取对象
     * @param id
     * @return
     */
    Supplier getById(Integer id);

    /**
     * 根据查询条件 获取对应视图对象的集合
     * @param oid
     * @param state
     * @param name
     * @return
     */
    List<Map<String, Object>> getByCriteria(Integer oid,  Boolean state, String name);

    /**
     * 根据 通用名称 或 助记码获取对应集合
     * @param name
     * @return
     */
    List<Map<String, Object>> getEnabledLikeByName(String name);


}
