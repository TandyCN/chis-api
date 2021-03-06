package pers.tandy.chis.modules.inventorymanagement.handler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.main.common.enums.ActionTypeEnum;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.modules.inventorymanagement.bean.InventorySubtract;
import pers.tandy.chis.modules.inventorymanagement.service.InventorySubtractService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/10/10 8:53
 * @Version 1.0
 */
@RequestMapping("/inventorySubtract")
@RestController
public class InventorySubtractHandler {

    private InventorySubtractService inventorySubtractService;
    @Autowired
    public void setInventorySubtractService(InventorySubtractService inventorySubtractService) {
        this.inventorySubtractService = inventorySubtractService;
    }

    /**
     * 采购退货
     * @param mapJson
     * @return
     */
    @PostMapping("/save")
    public PageResult save(@RequestBody String mapJson) {
        Map<String, String> map = JSONUtils.parseJsonToObject(mapJson, new TypeReference<Map<String, String>>() {});
        if (map.get("inventorySubtractJson") == null) {
            throw new RuntimeException("缺少请求参数");
        }

        String inventorySubtractJson = map.get("inventorySubtractJson");
        List<InventorySubtract> subtractList =
                JSONUtils.parseJsonToObject(inventorySubtractJson, new TypeReference<List<InventorySubtract>>() {});
        inventorySubtractService.save(subtractList, ActionTypeEnum.PURCHASE_SUBTRACT.getIndex());
        return PageResult.success();
    }

    /**
     * 驳回操作
     * @param lsh
     * @return
     */
    @PutMapping("/unapproved")
    public PageResult unapproved(String lsh) {
        inventorySubtractService.unapproved(lsh);
        return PageResult.success();
    }

    /**
     * 通过操作
     * @param lsh
     * @return
     */
    @PutMapping("/approved")
    public PageResult approved(String lsh) {
        inventorySubtractService.approved(lsh);
        return PageResult.success();
    }

    /**
     * 查询机构退货明细
     * @param pageNum
     * @param pageSize
     * @param creationDate
     * @param approveState
     * @return
     */
    @GetMapping("/getClinicListByCriteria")
    public PageResult getClinicListByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(value = "creationDate[]",required = false) String[] creationDate, // 创建日期
            @RequestParam(required = false) Byte approveState,
            @RequestParam(required = false) String pemSupplierName){

        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList =
                inventorySubtractService.getClinicListByCriteria(creationDate, user.getSysClinicId(), approveState, pemSupplierName);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }

    /**
     * 查询机构对应的汇总记录
     * @param pageNum
     * @param pageSize
     * @param creationDate
     * @param approveState
     * @return
     */
    @GetMapping("/getClinicLshGroupListByCriteria")
    public PageResult getClinicLshGroupListByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(value = "creationDate[]",required = false) String[] creationDate, // 创建日期
            @RequestParam(required = false) Byte approveState,
            @RequestParam(required = false) String pemSupplierName){

        // 获取用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList =
                inventorySubtractService.getClinicLshGroupListByCriteria(creationDate, user.getSysClinicId(), approveState, pemSupplierName);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }

    /**
     * 按流水号查询明细
     * @param lsh
     * @return
     */
    @GetMapping("/getByLsh")
    public List<Map<String, Object>> getByLsh(String lsh) {
        return inventorySubtractService.getByLsh(lsh);
    }












}
