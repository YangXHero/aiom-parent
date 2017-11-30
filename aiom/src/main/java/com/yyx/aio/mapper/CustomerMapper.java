package com.yyx.aio.mapper;

import com.yyx.aio.entity.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}