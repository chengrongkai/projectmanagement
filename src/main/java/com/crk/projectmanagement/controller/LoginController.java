package com.crk.projectmanagement.controller;

import com.crk.projectmanagement.entity.UserInfo;
import com.crk.projectmanagement.service.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 程荣凯
 * @Date: 2018/5/23 14:54
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login")
    private Map<String,Object> login(@RequestBody UserInfo userInfo){
        Map<String,Object> map = new HashMap<String,Object>(5);
        boolean success = loginService.login(userInfo);
        map.put("success",success);
        return map;
    }
    @PostMapping(value = "/register")
    private Map<String,Object> register(@RequestBody UserInfo userInfo){
        Map<String,Object> map = new HashMap<String,Object>(5);
        boolean success = loginService.register(userInfo);
        map.put("success",success);
        return map;
    }
    @PostMapping(value = "/resetPassword")
    private Map<String,Object> resetPassword(@RequestBody UserInfo userInfo){
        Map<String,Object> map = new HashMap<String,Object>(5);
        boolean success = loginService.resetPassword(userInfo);
        map.put("success",success);
        return map;
    }

}
