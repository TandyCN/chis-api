package pers.tandy.chis.modules.chargesitemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.ItemTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/8/7 10:10
 * @Version 1.0
 */
@RequestMapping("/medicalItem")
@RestController
public class MedicalItemHandler extends ItemHandler{

    public MedicalItemHandler() {
        super.CIM_ITEM_TYPE_ID = ItemTypeEnum.MEDICAL_ITEM.getIndex();
    }
}
