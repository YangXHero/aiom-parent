package com.yyx.aio.entity;

import java.util.Date;

public class Organization {
    private Long id;

    private String orgName;

    private String orgNumber;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    private Long operator;

    private String orgProv;

    private String orgAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public String getOrgProv() {
        return orgProv;
    }

    public void setOrgProv(String orgProv) {
        this.orgProv = orgProv;
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr;
    }
}