package com.yyx.aio.mapper;

import com.yyx.aio.entity.Machine;

public interface MachineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Machine record);

    int insertSelective(Machine record);

    Machine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
}