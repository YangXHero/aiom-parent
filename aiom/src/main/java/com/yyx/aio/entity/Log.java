package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class Log {
    private Long id;

    private Long userId;

    private String desc;

    private Integer type;

    private String code;

    private Date createTime;

    private String ip;

    private String method;

}