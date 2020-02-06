package pers.tandy.chis.modules.goodsitemmanagement.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tandy.chis.main.common.enums.GoodsTypeEnum;

/**
 * @Author: Tandy
 * @Date: 2019/8/19 16:52
 * @Version 1.0
 */
@RequestMapping("/chineseDrugs")
@RestController
public class ChineseDrugsHandler extends GoodsHandler {
    public ChineseDrugsHandler() {
        GSM_GOODS_TYPE_ID = GoodsTypeEnum.CHINESE_DRUGS.getIndex();
    }
}
