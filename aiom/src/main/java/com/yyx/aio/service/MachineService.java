package com.yyx.aio.service;
import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Machine;

import java.util.List;

/**
 * @author wuwei
 * @time 2017 11 30
 */
public interface MachineService {
    List<Machine> getMachineListByInfo(Machine machine, PageInfo pageInfo);

    int addMachine(Machine machine);

    int updateMachine(Machine machine);

    int deleteMachine(List<Machine> list);
}
