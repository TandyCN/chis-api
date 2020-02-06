package pers.tandy.chis.modules.doctorworkstation.Handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DiagnoseTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/11/7 13:14
 * @Version 1.0
 */
@RequestMapping("/westernDiagnoseLibrary")
@RestController
public class WesternDiagnoseLibraryHandler extends DiagnoseLibraryHandler {
    public WesternDiagnoseLibraryHandler() {
        super.DWT_DIAGNOSE_TYPE_ID = DiagnoseTypeEnum.WESTERN_DIAGNOSE.getIndex();
    }
}
