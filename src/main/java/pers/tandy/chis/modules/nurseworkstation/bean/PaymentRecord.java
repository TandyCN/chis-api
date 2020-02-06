package pers.tandy.chis.modules.nurseworkstation.bean;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class PaymentRecord implements Serializable {
    private Integer id;

    @Length(max = 50)
    private String lsh;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float cash;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float memberBalance;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float unionpay;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float alipay;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float wechatpay;

    private Integer sysPaymentWayId;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float sysPaymentWayAmount;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float actualAmount;

    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float disparityAmount;

    private Integer sysClinicId;

    private Integer creatorId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date creationDate;

    /*** 不保存 运算需求的字段 ******************************************************************************************/
    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float cashBackAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Float getMemberBalance() {
        return memberBalance;
    }

    public void setMemberBalance(Float memberBalance) {
        this.memberBalance = memberBalance;
    }

    public Float getUnionpay() {
        return unionpay;
    }

    public void setUnionpay(Float unionpay) {
        this.unionpay = unionpay;
    }

    public Float getAlipay() {
        return alipay;
    }

    public void setAlipay(Float alipay) {
        this.alipay = alipay;
    }

    public Float getWechatpay() {
        return wechatpay;
    }

    public void setWechatpay(Float wechatpay) {
        this.wechatpay = wechatpay;
    }

    public Integer getSysPaymentWayId() {
        return sysPaymentWayId;
    }

    public void setSysPaymentWayId(Integer sysPaymentWayId) {
        this.sysPaymentWayId = sysPaymentWayId;
    }

    public Float getSysPaymentWayAmount() {
        return sysPaymentWayAmount;
    }

    public void setSysPaymentWayAmount(Float sysPaymentWayAmount) {
        this.sysPaymentWayAmount = sysPaymentWayAmount;
    }

    public Float getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Float actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Float getDisparityAmount() {
        return disparityAmount;
    }

    public void setDisparityAmount(Float disparityAmount) {
        this.disparityAmount = disparityAmount;
    }

    public Integer getSysClinicId() {
        return sysClinicId;
    }

    public void setSysClinicId(Integer sysClinicId) {
        this.sysClinicId = sysClinicId;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Float getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(Float cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    @Override
    public String toString() {
        return "PaymentRecord{" +
                "id=" + id +
                ", lsh='" + lsh + '\'' +
                ", cash=" + cash +
                ", memberBalance=" + memberBalance +
                ", unionpay=" + unionpay +
                ", alipay=" + alipay +
                ", wechatpay=" + wechatpay +
                ", sysPaymentWayId=" + sysPaymentWayId +
                ", sysPaymentWayAmount=" + sysPaymentWayAmount +
                ", actualAmount=" + actualAmount +
                ", disparityAmount=" + disparityAmount +
                ", sysClinicId=" + sysClinicId +
                ", creatorId=" + creatorId +
                ", creationDate=" + creationDate +
                ", cashBackAmount=" + cashBackAmount +
                '}';
    }
}
