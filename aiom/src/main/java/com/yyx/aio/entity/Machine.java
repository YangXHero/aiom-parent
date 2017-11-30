package com.yyx.aio.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class Machine {
    private Long id;

    private String macName;

    private String macSeries;

    private String macType;

    private String macManufacturer;

    private Long macUser;

    private Date macWorkTime;

    private Integer macState;

    private Date createTime;

    private Date updateTime;

    private Long operatorId;

    private Integer state;

    private Long macOrg;

    private Long updatorId;

    private String creator;

}