package com.yyx.aio.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wuwei
 * @time 2017 11 30
 */
@Data
public class AddrDist {
    private String distCd;

    private String provName;

    private String provAbbr;

    private String provAbbrName;

    private String cityName;

    private String cityAbbr;

    private String cityAbbrName;

    private String ctyName;

    private String ctyAbbr;

    private String ctyAbbrName;

    private String statCd;

    private BigDecimal levCd;
}