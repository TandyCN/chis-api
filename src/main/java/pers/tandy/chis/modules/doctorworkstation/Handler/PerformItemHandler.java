package pers.tandy.chis.modules.doctorworkstation.Handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.modules.doctorworkstation.service.PerformItemService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/12/26 14:39
 * @Version 1.0
 */
@RequestMapping("/performItem")
@RestController
public class PerformItemHandler {

    private PerformItemService performItemService;
    @Autowired
    public void setPerformItemService(PerformItemService performItemService) {
        this.performItemService = performItemService;
    }

    /**
     * 修改剩余次数
     * @param id
     * @param performQuantity
     * @return
     */
    @PutMapping("/updateResidueQuantityById")
    public PageResult updateResidueQuantityById(@RequestParam Integer id, @RequestParam Integer performQuantity) {
        performItemService.updateResidueQuantityById(id, performQuantity);
        return PageResult.success();
    }

    /**
     * 根据条件获取对象集合
     * @param pageNum
     * @param pageSize
     * @param mrmMemberId
     * @param cimItemName
     * @param showZero
     * @return
     */
    @GetMapping("/getByCriteria")
    public PageResult getByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(required = false) Integer mrmMemberId,
            @RequestParam(required = false) String cimItemName,
            @RequestParam(required = false) Boolean showZero){

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList = performItemService.getByCriteria(mrmMemberId, cimItemName, showZero);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }



}
