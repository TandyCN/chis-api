package pers.tandy.chis.modules.membermanagement.bean;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Township implements Serializable {
    private Integer id;

    @Length(max = 50)
    @NotBlank
    private String name;

    @Length(max = 50)
    @NotBlank
    private String code;

    @NotNull
    private Byte typeId;

    @NotNull
    private Short typeNo = 0;

    @NotNull
    private Integer sysLocationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Short getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Short typeNo) {
        this.typeNo = typeNo;
    }

    public Integer getSysLocationId() {
        return sysLocationId;
    }

    public void setSysLocationId(Integer sysLocationId) {
        this.sysLocationId = sysLocationId;
    }
}
