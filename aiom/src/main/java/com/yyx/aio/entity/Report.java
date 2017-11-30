package com.yyx.aio.entity;

import java.util.Date;

public class Report {
    private Long id;

    private Integer postUser;

    private Integer collectNumber;

    private Integer returnNumber;

    private Long state;

    private Date createTime;

    private Date updateTime;

    private Long operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPostUser() {
        return postUser;
    }

    public void setPostUser(Integer postUser) {
        this.postUser = postUser;
    }

    public Integer getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        this.collectNumber = collectNumber;
    }

    public Integer getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(Integer returnNumber) {
        this.returnNumber = returnNumber;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
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
}