package pers.tandy.chis.modules.systemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DictTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/7/28 20:57
 * @Version 1.0
 */
@RequestMapping("/profession")
@RestController
public class ProfessionHandler extends DictHandler{
    public ProfessionHandler() {
        super.SYS_DICT_TYPE_ID = DictTypeEnum.PROFESSION.getIndex();
    }
}
