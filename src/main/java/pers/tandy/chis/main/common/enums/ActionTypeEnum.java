package pers.tandy.chis.main.common.enums;

/**
 * @Author: Tandy
 * @Date: 2019/9/22 22:19
 * @Version 1.0
 */
public enum ActionTypeEnum {
    PURCHASE_ADD("采购入库", (byte)1),
    PURCHASE_SUBTRACT("采购退库", (byte)2);

    private String name;
    private byte index;

    private ActionTypeEnum(String name, byte index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getIndex() {
        return index;
    }

    public void setIndex(byte index) {
        this.index = index;
    }
}
