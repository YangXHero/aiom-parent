package com.yyx.aio.controller;

/**
 * @author Xhero
 * @create 2017-11-28-9:46
 */

import com.yyx.aio.common.entity.ResponseEntity;
import com.yyx.aio.common.entity.SuccessResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @PostMapping("/users")
    public ResponseEntity listUsers(){
        return new SuccessResponseEntity();
    }
}
