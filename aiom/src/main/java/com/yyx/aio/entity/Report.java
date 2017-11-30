package com.yyx.aio.entity;

import lombok.Data;
/**
 * @author wuwei
 * @time 2017 11 30
 */

import java.util.Date;
@Data
public class Report {
    private Long id;

    private Integer postUser;

    private Integer collectNumber;

    private Integer returnNumber;

    private Long state;

    private Date createTime;

    private Date updateTime;

    private Long operator;

}