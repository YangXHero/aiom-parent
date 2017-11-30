package com.yyx.aio.entity;

import java.util.Date;

public class Authority {
    private Long id;

    private String name;

    private String url;

    private Date createTime;

    private String creator;

    private Long creatorId;

    private String hassub;

    private String state;

    private Date updateTime;

    private String hierarchical;

    private Integer orderbyId;

    private Long pid;

    private String showMenu;

    private String showType;

    private String iconClass;

    private String access;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getHassub() {
        return hassub;
    }

    public void setHassub(String hassub) {
        this.hassub = hassub;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(String hierarchical) {
        this.hierarchical = hierarchical;
    }

    public Integer getOrderbyId() {
        return orderbyId;
    }

    public void setOrderbyId(Integer orderbyId) {
        this.orderbyId = orderbyId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getShowMenu() {
        return showMenu;
    }

    public void setShowMenu(String showMenu) {
        this.showMenu = showMenu;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}