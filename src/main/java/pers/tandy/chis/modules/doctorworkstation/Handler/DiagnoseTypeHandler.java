package pers.tandy.chis.modules.doctorworkstation.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.modules.doctorworkstation.bean.DiagnoseType;
import pers.tandy.chis.modules.doctorworkstation.service.DiagnoseTypeService;

import java.util.List;

/**
 * @Author: Tandy
 * @Date: 2019/11/7 22:46
 * @Version 1.0
 */
@RequestMapping("/diagnoseType")
@RestController
public class DiagnoseTypeHandler {

    private DiagnoseTypeService diagnoseTypeService;
    @Autowired
    public void setDiagnoseTypeService(DiagnoseTypeService diagnoseTypeService) {
        this.diagnoseTypeService = diagnoseTypeService;
    }

    /**
     * 获取所有诊断类型
     * @return
     */
    @GetMapping("/getAll")
    public List<DiagnoseType> getAll() {
        return diagnoseTypeService.getAll();
    }

}
