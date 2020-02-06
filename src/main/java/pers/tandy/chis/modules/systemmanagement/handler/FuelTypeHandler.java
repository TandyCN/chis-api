package pers.tandy.chis.modules.systemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.DictTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/8/13 16:29
 * @Version 1.0
 */
@RequestMapping("/fuelType")
@RestController
public class FuelTypeHandler extends DictHandler {
    public FuelTypeHandler() {
        super.SYS_DICT_TYPE_ID = DictTypeEnum.FUEL_TYPE.getIndex();
    }
}
