package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;

@Data
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

}