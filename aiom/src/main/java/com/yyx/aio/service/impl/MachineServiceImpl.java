package com.yyx.aio.service.impl;

import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Machine;
import com.yyx.aio.mapper.MachineMapper;
import com.yyx.aio.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuwei
 * @time 2017 11 30
 */
@Service("machineService")
public class MachineServiceImpl implements MachineService{

    @Autowired(required = false)
    private MachineMapper machineMapper;

    @Override
    public List<Machine> getMachineListByInfo(Machine machine, PageInfo pageInfo) {
        return machineMapper.selectMachineListByInfo(machine,pageInfo);
    }

    @Override
    public int addMachine(Machine machine) {
        return machineMapper.insert(machine);
    }

    @Override
    public int updateMachine(Machine machine) {
        return machineMapper.updateByPrimaryKey(machine);
    }

    @Override
    public int deleteMachine(List<Machine> list) {
        int deleteStatus = 0;
        for (Machine e: list) {
            deleteStatus+=machineMapper.deleteByPrimaryKey(e.getId());
        }
        return deleteStatus;
    }

}
