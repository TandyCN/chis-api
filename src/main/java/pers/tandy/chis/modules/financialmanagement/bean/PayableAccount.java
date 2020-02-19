package pers.tandy.chis.modules.financialmanagement.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PayableAccount {
    private Integer id;

    @NotBlank
    private String lsh;

    @NotNull
    private Integer pemSupplierId;

    @Min(0)
    @Digits(integer = 8, fraction = 2)
    @NotNull
    private Float payableAmount;

    @NotNull
    private Integer sysClinicId;

    @NotNull
    private Integer creatorId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date creationDate;

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

    public Integer getPemSupplierId() {
        return pemSupplierId;
    }

    public void setPemSupplierId(Integer pemSupplierId) {
        this.pemSupplierId = pemSupplierId;
    }

    public Float getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Float payableAmount) {
        this.payableAmount = payableAmount;
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
}
