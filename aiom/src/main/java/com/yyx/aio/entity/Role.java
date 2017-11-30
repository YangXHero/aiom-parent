package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class Role {
    private Long id;

    private String roleName;

    private String roleDesc;

    private Date createTime;

    private String creator;

    private Long creatorId;

    private Integer hasvalid;

    private Date updateTime;

    private String updator;

    private Long updatorId;

}