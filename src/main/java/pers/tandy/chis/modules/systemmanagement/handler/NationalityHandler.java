package pers.tandy.chis.modules.systemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DictTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/10/20 12:47
 * @Version 1.0
 */
@RequestMapping("/nationality")
@RestController
public class NationalityHandler extends DictHandler {
    public NationalityHandler() {
        super.SYS_DICT_TYPE_ID = DictTypeEnum.NATIONALITY.getIndex();
    }
}
