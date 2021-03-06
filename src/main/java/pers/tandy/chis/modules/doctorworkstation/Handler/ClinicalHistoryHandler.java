package pers.tandy.chis.modules.doctorworkstation.Handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pers.tandy.chis.main.common.PageResult;
import pers.tandy.chis.main.component.JSRMessageUtils;
import pers.tandy.chis.modules.doctorworkstation.bean.ClinicalHistory;
import pers.tandy.chis.modules.doctorworkstation.bean.SellPrescription;
import pers.tandy.chis.modules.doctorworkstation.service.ClinicalHistoryService;
import pers.tandy.chis.modules.doctorworkstation.service.SellPrescriptionService;
import pers.tandy.chis.modules.systemmanagement.bean.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Tandy
 * @Date: 2019/11/16 14:34
 * @Version 1.0
 */
@RequestMapping("/clinicalHistory")
@RestController
public class ClinicalHistoryHandler {

    private ClinicalHistoryService clinicalHistoryService;
    @Autowired
    public void setClinicalHistoryService(ClinicalHistoryService clinicalHistoryService) {
        this.clinicalHistoryService = clinicalHistoryService;
    }

    private SellPrescriptionService sellPrescriptionService;
    @Autowired
    public void setSellPrescriptionService(SellPrescriptionService sellPrescriptionService) {
        this.sellPrescriptionService = sellPrescriptionService;
    }
    /* -------------------------------------------------------------------------------------------------------------- */

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
            map.put("clinicalHistory", clinicalHistoryService.getById(id));
        }
    }

    /**
     * 保存操作
     * @param clinicalHistory
     * @param result
     * @return
     */
    @PostMapping("/save")
    public PageResult save (@Valid ClinicalHistory clinicalHistory, BindingResult result) {
        if (result.hasErrors()) {
            return PageResult.fail().msg(JSRMessageUtils.getFirstMsg(result));
        }
        ClinicalHistory resultClinicalHistory = clinicalHistoryService.save(clinicalHistory);
        return PageResult.success().resultSet("id", resultClinicalHistory.getId());
    }

    /**
     * 修改操作
     * @param clinicalHistory
     * @param result
     * @return
     */
    @PutMapping("/update")
    public PageResult update (@Valid ClinicalHistory clinicalHistory, BindingResult result) {
        if (result.hasErrors()) {
            return PageResult.fail().msg(JSRMessageUtils.getFirstMsg(result));
        }

        Integer id = clinicalHistoryService.update(clinicalHistory).getId();
        return PageResult.success().resultSet("id", id);
    }

    /**
     * 获取对应会员的病例信息
     * @param pageNum
     * @param pageSize
     * @param mrmMemberId
     * @return
     */
    @GetMapping("/getByMrmMemberId")
    public PageResult getByMrmMemberId (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam Integer mrmMemberId){

        if (pageSize != 1) {
            return PageResult.fail().msg("pageSize参数错误, 一次只能请求一个病例");
        }

        // 获取病例信息
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList = clinicalHistoryService.getByCriteria(null, mrmMemberId, null);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);

        // 获取病例对应的处方信息
        List<SellPrescription> prescriptionList = new ArrayList<>();
        if(!pageList.isEmpty()) {
            Object id = pageList.get(0).get("id");
            prescriptionList = this.sellPrescriptionService.getByClinicalHistoryId(Integer.parseInt(id.toString()));
        }

        return PageResult.success().resultSet("page", pageInfo).resultSet("prescriptionList", prescriptionList);
    }

    /**
     * 获取对应会员的病例信息 用于历史病例加载
     * @param pageNum
     * @param pageSize
     * @param mrmMemberId
     * @return
     */
    @GetMapping("/getByCriteria")
    public PageResult getByCriteria (
            @RequestParam(defaultValue="1") Integer pageNum,
            @RequestParam(defaultValue="1") Integer pageSize,
            @RequestParam(value = "creationDate[]",required = false) String[] creationDate,
            @RequestParam Integer mrmMemberId,
            @RequestParam(required = false) Integer dwtDiagnoseTypeId){

        // 获取病例信息
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, Object>> pageList = clinicalHistoryService.getByCriteria(creationDate, mrmMemberId, dwtDiagnoseTypeId);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageList);
        return PageResult.success().resultSet("page", pageInfo);
    }


    /**
     * 获取对应会员未归档的病例
     * @param mrmMemberId
     * @return
     */
    @GetMapping("/getLastUnfinishedByCriteria")
    public PageResult getLastUnfinishedByCriteria (@RequestParam Integer mrmMemberId){
        User user = (User) SecurityUtils.getSubject().getPrincipal(); // 获取用户信息
        Map<String, Object> clinicalHistory =
                clinicalHistoryService.getLastUnfinishedByCriteria(mrmMemberId, user.getId());
        return PageResult.success().resultSet("clinicalHistory", clinicalHistory);
    }


}
