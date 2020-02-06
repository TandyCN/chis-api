package pers.tandy.chis.modules.inventorymanagement.service;

import pers.tandy.chis.modules.inventorymanagement.bean.InventoryType;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/9/29 18:04
 * @Version 1.0
 */
public interface InventoryTypeService {
    /**
     * 获取所有对象
     * @return
     */
    List<InventoryType> getAll();
}
