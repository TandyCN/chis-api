package pers.tandy.chis.modules.datareport.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class SellRecord extends SellRecordAttach implements Serializable {
    private Integer id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date creationDate;

    @Length(max = 50)
    @NotBlank
    private String lsh;

    @Length(max = 50)
    @NotBlank
    private String mxh;

    @Length(max = 50)
    private String dwtSellPrescriptionLsh;

    private Integer invoiceTypeId;

    @Length(max = 50)
    private String invoiceNo;

    @NotNull
    private Integer sysSellWayId;

    @NotNull
    private Integer sysSellTypeId;

    @NotNull
    private Integer entityTypeId;

    @NotNull
    private Integer entityId;

    @Digits(integer = 8, fraction = 4)
    @Min(0)
    @NotNull
    private Float retailPrice;

    @Digits(integer = 8, fraction = 4)
    @Min(0)
    @NotNull
    private Float actualRetailPrice;

    @Max(99)
    @Min(0)
    @NotNull
    private Byte purchaseTaxRate;

    @Max(99)
    @Min(0)
    @NotNull
    private Byte sellTaxRate;

    @NotNull
    private Boolean discountable;

    private Boolean lossable;

    private Integer iymInventoryId;

    @Length(max = 50)
    private String ph;

    @Length(max = 50)
    private String pch;

    @Min(1)
    private Integer splitQuantity = 1;

    @Max(30000)
    @Min(1)
    @NotNull
    private Integer quantity = 1;

    @Digits(integer = 8, fraction = 4)
    @Min(0)
    private Float costPrice = 0f;

    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date producedDate;

    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expiryDate;

    private Integer pemSupplierId;

    private Integer iymInventoryAddId;

    // @NotNull
    private Integer mrmMemberId;

    @Digits(integer = 1, fraction = 1)
    @Min(0)
    // @NotNull
    private Float memberDiscountRate;

    private Integer sysClinicId;

    private Integer sellerId;

    private Integer operatorId;

    private Integer cashierId;

    private Boolean payState = false;

    private Boolean returned = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public String getMxh() {
        return mxh;
    }

    public void setMxh(String mxh) {
        this.mxh = mxh == null ? null : mxh.trim();
    }

    public String getDwtSellPrescriptionLsh() {
        return dwtSellPrescriptionLsh;
    }

    public void setDwtSellPrescriptionLsh(String dwtSellPrescriptionLsh) {
        this.dwtSellPrescriptionLsh = dwtSellPrescriptionLsh == null ? null : dwtSellPrescriptionLsh.trim();
    }

    public Integer getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(Integer invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Integer getSysSellWayId() {
        return sysSellWayId;
    }

    public void setSysSellWayId(Integer sysSellWayId) {
        this.sysSellWayId = sysSellWayId;
    }

    public Integer getSysSellTypeId() {
        return sysSellTypeId;
    }

    public void setSysSellTypeId(Integer sysSellTypeId) {
        this.sysSellTypeId = sysSellTypeId;
    }

    public Integer getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Integer entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Float getActualRetailPrice() {
        return actualRetailPrice;
    }

    public void setActualRetailPrice(Float actualRetailPrice) {
        this.actualRetailPrice = actualRetailPrice;
    }

    public Byte getPurchaseTaxRate() {
        return purchaseTaxRate;
    }

    public void setPurchaseTaxRate(Byte purchaseTaxRate) {
        this.purchaseTaxRate = purchaseTaxRate;
    }

    public Byte getSellTaxRate() {
        return sellTaxRate;
    }

    public void setSellTaxRate(Byte sellTaxRate) {
        this.sellTaxRate = sellTaxRate;
    }

    public Boolean getDiscountable() {
        return discountable;
    }

    public void setDiscountable(Boolean discountable) {
        this.discountable = discountable;
    }

    public Boolean getLossable() {
        return lossable;
    }

    public void setLossable(Boolean lossable) {
        this.lossable = lossable;
    }

    public Integer getIymInventoryId() {
        return iymInventoryId;
    }

    public void setIymInventoryId(Integer iymInventoryId) {
        this.iymInventoryId = iymInventoryId;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph == null ? null : ph.trim();
    }

    public String getPch() {
        return pch;
    }

    public void setPch(String pch) {
        this.pch = pch == null ? null : pch.trim();
    }

    public Integer getSplitQuantity() {
        return splitQuantity;
    }

    public void setSplitQuantity(Integer splitQuantity) {
        this.splitQuantity = splitQuantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
    }

    public Date getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(Date producedDate) {
        this.producedDate = producedDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getPemSupplierId() {
        return pemSupplierId;
    }

    public void setPemSupplierId(Integer pemSupplierId) {
        this.pemSupplierId = pemSupplierId;
    }

    public Integer getIymInventoryAddId() {
        return iymInventoryAddId;
    }

    public void setIymInventoryAddId(Integer iymInventoryAddId) {
        this.iymInventoryAddId = iymInventoryAddId;
    }

    public Integer getMrmMemberId() {
        return mrmMemberId;
    }

    public void setMrmMemberId(Integer mrmMemberId) {
        this.mrmMemberId = mrmMemberId;
    }

    public Float getMemberDiscountRate() {
        return memberDiscountRate;
    }

    public void setMemberDiscountRate(Float memberDiscountRate) {
        this.memberDiscountRate = memberDiscountRate;
    }

    public Integer getSysClinicId() {
        return sysClinicId;
    }

    public void setSysClinicId(Integer sysClinicId) {
        this.sysClinicId = sysClinicId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public Boolean getPayState() {
        return payState;
    }

    public void setPayState(Boolean payState) {
        this.payState = payState;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }
}
