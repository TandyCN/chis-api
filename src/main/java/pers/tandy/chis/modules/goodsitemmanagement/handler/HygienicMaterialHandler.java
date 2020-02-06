package pers.tandy.chis.modules.goodsitemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.GoodsTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/8/19 16:52
 * @Version 1.0
 */
@RequestMapping("/hygienicMaterial")
@RestController
public class HygienicMaterialHandler extends GoodsHandler {
    public HygienicMaterialHandler() {
        GSM_GOODS_TYPE_ID = GoodsTypeEnum.HYGIENIC_MATERIAL.getIndex();
    }
}
