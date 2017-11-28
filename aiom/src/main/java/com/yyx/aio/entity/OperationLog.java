package com.yyx.aio.entity;

import java.io.Serializable;
import java.util.Date;

public class OperationLog implements Serializable{
    private Long id;

    private Long userId;

    private Date operTime;

    private String requestUri;

    private Long requestMillis;

    private String requestParam;

    private String requestResult;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public Long getRequestMillis() {
        return requestMillis;
    }

    public void setRequestMillis(Long requestMillis) {
        this.requestMillis = requestMillis;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
}