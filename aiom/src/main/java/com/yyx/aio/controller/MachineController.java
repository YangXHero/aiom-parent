package com.yyx.aio.controller;

import com.yyx.aio.common.entity.ErrorResponseEntity;
import com.yyx.aio.common.entity.ResponseEntity;
import com.yyx.aio.common.entity.SuccessResponseEntity;
import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Machine;
import com.yyx.aio.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MachineController {
    @Autowired(required = false)
    MachineService machineService;

    /**
     * 获取设备列表
     * @param machine
     * @param pageInfo
     * @return
     */
    @GetMapping("getMachineListByInfo")
    public ResponseEntity getMachineListByInfo(Machine machine, PageInfo pageInfo){

        try {
            List<Machine> list =machineService.getMachineListByInfo(machine,pageInfo);
            return new SuccessResponseEntity(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }

    }

    /**
     * 添加设备
     * @param machine
     * @return
     */
    @PostMapping("addMachine")
    public ResponseEntity addMachine(Machine machine){

        try {
            int insertStatus =machineService.addMachine(machine);
            return new SuccessResponseEntity(insertStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }

    }

    /**
     * 更新设备
     * @param machine
     * @return
     */
    @PostMapping("updateMachine")
    public ResponseEntity updateMachine(Machine machine){

        try {
            int updateStatus =machineService.updateMachine(machine);
            return new SuccessResponseEntity(updateStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }

    }

    /**
     * 删除设备
     * @param list
     * @return
     */
    @PostMapping("deleteMachine")
    public ResponseEntity deleteMachine(List<Machine> list){

        try {
            int deleteStatus =machineService.deleteMachine(list);
            return new SuccessResponseEntity(deleteStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }

    }

}
