package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class Customer {
    private Long id;

    private String custName;

    private String custCode;

    private String custParent;

    private Date createTime;

    private Date updateTime;

    private Integer state;

}