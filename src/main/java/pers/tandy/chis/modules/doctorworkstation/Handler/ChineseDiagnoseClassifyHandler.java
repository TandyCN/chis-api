package pers.tandy.chis.modules.doctorworkstation.Handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DiagnoseTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/11/7 12:08
 * @Version 1.0
 */
@RequestMapping("/chineseDiagnoseClassify")
@RestController
public class ChineseDiagnoseClassifyHandler extends DiagnoseClassifyHandler {

    public ChineseDiagnoseClassifyHandler() {
        super.DWT_DIAGNOSE_TYPE_ID = DiagnoseTypeEnum.CHINESE_DIAGNOSE.getIndex();
    }
}
