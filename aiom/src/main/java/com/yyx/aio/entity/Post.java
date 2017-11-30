package com.yyx.aio.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class Post {
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

}