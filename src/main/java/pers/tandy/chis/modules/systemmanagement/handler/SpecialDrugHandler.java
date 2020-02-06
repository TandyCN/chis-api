package pers.tandy.chis.modules.systemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DictTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/8/16 18:00
 * @Version 1.0
 */
@RequestMapping("/specialDrug")
@RestController
public class SpecialDrugHandler extends DictHandler {
    public SpecialDrugHandler () {
        super.SYS_DICT_TYPE_ID = DictTypeEnum.SPECIAL_DRUG.getIndex();
    }
}
