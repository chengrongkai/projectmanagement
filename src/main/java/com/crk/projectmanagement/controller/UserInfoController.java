package com.crk.projectmanagement.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/UserInfo")
public class UserInfoController {
    @Resource
    private UserService userService;

    /**
     * 获取用户信息
     * @param userName
     * @return
     */
    @GetMapping(value = "/getUserInfo")
    private Map<String,Object> getUserInfo(@RequestParam("userName") String userName){
        Map<String,Object> map = new HashMap<String,Object>();
        UserInfo userInfo = userService.getUserInfo(userName);
        map.put("userInfo",userInfo);
        return map;
    }
}
