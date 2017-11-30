package com.yyx.aio.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PostRAS {
    private Long id;

    private String postCode;

    private Integer postWeight;

    private Long postUser;

    private Date postTime;

    private Integer postState;

    private Integer postOperation;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private Long operatorId;

    private Integer postFlow;

    private Integer postLength;

    private Integer postWidth;

    private Integer postHeight;

    private Long postType;

    private Long postCust;

    private BigDecimal postMoney;

    private Long updatorId;

    private String createor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getPostWeight() {
        return postWeight;
    }

    public void setPostWeight(Integer postWeight) {
        this.postWeight = postWeight;
    }

    public Long getPostUser() {
        return postUser;
    }

    public void setPostUser(Long postUser) {
        this.postUser = postUser;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Integer getPostState() {
        return postState;
    }

    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    public Integer getPostOperation() {
        return postOperation;
    }

    public void setPostOperation(Integer postOperation) {
        this.postOperation = postOperation;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getPostFlow() {
        return postFlow;
    }

    public void setPostFlow(Integer postFlow) {
        this.postFlow = postFlow;
    }

    public Integer getPostLength() {
        return postLength;
    }

    public void setPostLength(Integer postLength) {
        this.postLength = postLength;
    }

    public Integer getPostWidth() {
        return postWidth;
    }

    public void setPostWidth(Integer postWidth) {
        this.postWidth = postWidth;
    }

    public Integer getPostHeight() {
        return postHeight;
    }

    public void setPostHeight(Integer postHeight) {
        this.postHeight = postHeight;
    }

    public Long getPostType() {
        return postType;
    }

    public void setPostType(Long postType) {
        this.postType = postType;
    }

    public Long getPostCust() {
        return postCust;
    }

    public void setPostCust(Long postCust) {
        this.postCust = postCust;
    }

    public BigDecimal getPostMoney() {
        return postMoney;
    }

    public void setPostMoney(BigDecimal postMoney) {
        this.postMoney = postMoney;
    }

    public Long getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    public String getCreateor() {
        return createor;
    }

    public void setCreateor(String createor) {
        this.createor = createor;
    }
}