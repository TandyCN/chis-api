package pers.tandy.chis.modules.purchasemanagement.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.main.component.JSRMessageUtils;
import pers.tandy.chis.modules.purchasemanagement.bean.Supplier;
import pers.tandy.chis.modules.purchasemanagement.service.SupplierService;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/8/19 16:11
 * @Version 1.0
 */
@RequestMapping("/supplier")
@RestController
public class SupplierHandler {

    private SupplierService supplierService;
    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    /**
     * 请求参数中带有 ID 的方法在被调用前都会先调用此方法
     * 如果 ID 部位空则会进行查询并填充 model
     * map 中的 key 必须为 model 类名首字母小写
     * @param id
     * @param map
     */
    @ModelAttribute
    public void getById (@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
        if (id != null) {
            map.put("supplier", supplierService.getById(id));
        }
    }

    /**
     * 保存操作
     * @param supplier
     * @param result
     * @return
     */
    @PostMapping("/save")
    public PageResult save (@Valid Supplier supplier, BindingResult result) {
        if (result.hasErrors()) {
            return PageResult.fail().msg(JSRMessageUtils.getFirstMsg(result));
        }

        supplierService.save(supplier);
        return PageResult.success();
    }

    /**
     * 修改操作
     * @param supplier
     * @param result
     * @return
     */
    @PutMapping("/update")
    public PageResult update (@Valid Supplier supplier, BindingResult result) {
        if (result.hasErrors()) {
            return PageResult.fail().msg(JSRMessageUtils.getFirstMsg(result));
        }

        supplierService.update(supplier);
        return PageResult.success();
    }

    /**
     * 删除操作
     * @param supplier
     * @return
     */
    @DeleteMapping("/delete")
    public PageResult delete (Supplier supplier) {
        supplierService.delete(supplier);
        return PageResult.success();
    }

    /**
     * 根据查询条件进行分页查询
     * @param pageNum
     * @param pageSize
     * @param oid
     * @param name
     * @param state
     * @return
     */
    @GetMapping("/getByCriteria")
    public PageResult getByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(required = false) Integer oid,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Boolean state){

        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList = supplierService.getByCriteria(oid, state, name);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }

    /**
     * 根据 通用名称 或 助记码 进行模糊查询
     * @param name
     * @return
     */
    @GetMapping("/getEnabledLikeByName")
    public List<Map<String, Object>> getEnabledLikeByName (@RequestParam("name") String name) {
        if (name == null || name.trim().equals("")) {
            return null;
        }
        return supplierService.getEnabledLikeByName(name);
    }

}
