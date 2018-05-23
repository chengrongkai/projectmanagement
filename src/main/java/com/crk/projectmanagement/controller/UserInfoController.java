package com.crk.projectmanagement.controller;

import com.crk.projectmanagement.entity.UserInfo;
import com.crk.projectmanagement.service.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
/**
 * @Author: 程荣凯
 * @Date: 2018/5/23 14:54
 */
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
        Map<String,Object> map = new HashMap<String,Object>(5);
        UserInfo userInfo = userService.getUserInfo(userName);
        map.put("userInfo",userInfo);
        return map;
    }
}
