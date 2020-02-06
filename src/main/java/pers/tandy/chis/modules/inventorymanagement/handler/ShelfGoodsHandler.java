package pers.tandy.chis.modules.inventorymanagement.handler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.main.component.JSONUtils;
import pers.tandy.chis.modules.inventorymanagement.bean.ShelfGoods;
import pers.tandy.chis.modules.inventorymanagement.service.ShelfGoodsService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2020/1/5 15:29
 * @Version 1.0
 */
@RequestMapping("/shelfGoods")
@RestController
public class ShelfGoodsHandler {
    private ShelfGoodsService shelfGoodsService;
    @Autowired
    public void setShelfGoodsService(ShelfGoodsService shelfGoodsService) {
        this.shelfGoodsService = shelfGoodsService;
    }

    /**
     * 添加或修改对象集合操作
     * @return
     */
    @PostMapping("/saveOrUpdateList")
    public PageResult saveOrUpdateList(@RequestBody String mapJson) {
        Map<String, String> map = JSONUtils.parseJsonToObject(mapJson, new TypeReference<Map<String, String>>() {});
        if (map.get("shelfGoodsListJson") == null) {
            return  PageResult.fail().msg("缺少请求参数");
        }

        String shelfGoodsListJson =  map.get("shelfGoodsListJson");
        List<ShelfGoods> shelfGoodsList = JSONUtils.parseJsonToObject(shelfGoodsListJson, new TypeReference<List<ShelfGoods>>() {});
        shelfGoodsService.saveOrUpdateList(shelfGoodsList);
        return PageResult.success();
    }


    @GetMapping("/getClinicListByCriteria")
    public PageResult getClinicListByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(required = false) Integer gsmGoodsTypeId,
            @RequestParam(required = false) String gsmGoodsName,
            @RequestParam(required = false) String iymShelfPositionName){

        User user = (User) SecurityUtils.getSubject().getPrincipal();  // 获取用户信息
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList =
                shelfGoodsService.getClinicListByCriteria(user.getSysClinicId(), gsmGoodsTypeId, gsmGoodsName, iymShelfPositionName);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }




}
