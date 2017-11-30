package com.yyx.aio.entity;

import java.util.Date;

public class Machine {
    private Long id;

    private String macName;

    private String macSeries;

    private String macType;

    private String macManufacturer;

    private Long macUser;

    private Date macWorkTime;

    private Integer macState;

    private Date createTime;

    private Date updateTime;

    private Long operatorId;

    private Integer state;

    private Long macOrg;

    private Long updatorId;

    private String creator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMacName() {
        return macName;
    }

    public void setMacName(String macName) {
        this.macName = macName;
    }

    public String getMacSeries() {
        return macSeries;
    }

    public void setMacSeries(String macSeries) {
        this.macSeries = macSeries;
    }

    public String getMacType() {
        return macType;
    }

    public void setMacType(String macType) {
        this.macType = macType;
    }

    public String getMacManufacturer() {
        return macManufacturer;
    }

    public void setMacManufacturer(String macManufacturer) {
        this.macManufacturer = macManufacturer;
    }

    public Long getMacUser() {
        return macUser;
    }

    public void setMacUser(Long macUser) {
        this.macUser = macUser;
    }

    public Date getMacWorkTime() {
        return macWorkTime;
    }

    public void setMacWorkTime(Date macWorkTime) {
        this.macWorkTime = macWorkTime;
    }

    public Integer getMacState() {
        return macState;
    }

    public void setMacState(Integer macState) {
        this.macState = macState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getMacOrg() {
        return macOrg;
    }

    public void setMacOrg(Long macOrg) {
        this.macOrg = macOrg;
    }

    public Long getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}