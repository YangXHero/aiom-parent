package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
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

}