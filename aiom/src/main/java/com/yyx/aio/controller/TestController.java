package com.yyx.aio.controller;

/**
 * @author Xhero
 * @create 2017-11-28-9:46
 */

import com.yyx.aio.common.entity.ResponseEntity;
import com.yyx.aio.common.entity.SuccessResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @PostMapping("/login")
    public ResponseEntity login(HttpServletRequest request, String username, String password){
        return new SuccessResponseEntity();
    }
    @GetMapping("/login")
    public ResponseEntity loginGet(HttpServletRequest request, String username, String password){
        return new SuccessResponseEntity();
    }
    @PostMapping("/users")
    public ResponseEntity listUsers(){
        return new SuccessResponseEntity();
    }
}
