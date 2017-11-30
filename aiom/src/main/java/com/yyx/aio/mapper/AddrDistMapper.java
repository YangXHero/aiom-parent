package com.yyx.aio.mapper;

import com.yyx.aio.entity.AddrDist;

public interface AddrDistMapper {
    int deleteByPrimaryKey(String distCd);

    int insert(AddrDist record);

    int insertSelective(AddrDist record);

    AddrDist selectByPrimaryKey(String distCd);

    int updateByPrimaryKeySelective(AddrDist record);

    int updateByPrimaryKey(AddrDist record);
}