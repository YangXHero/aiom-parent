package com.yyx.aio.mapper;

import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Machine;

import java.util.List;

public interface MachineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Machine record);

    int insertSelective(Machine record);

    Machine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);

    List<Machine> selectMachineListByInfo(Machine machine, PageInfo pageInfo);
}