package com.crk.projectmanagement.service.service;

import com.crk.projectmanagement.entity.UserInfo;
/**
 * @Author: 程荣凯
 * @Date: 2018/5/23 14:54
 */
public interface LoginService {
    /**
     * 用户登录
     * @param userInfo 用户信息
     * @return 登录结果
     */
    boolean login(UserInfo userInfo);

    /**
     * 用户注册
     * @param userInfo 用户信息
     * @return 注册结果
     */
    boolean register(UserInfo userInfo);

    /**
     * 重置密码
     * @param userInfo 用户信息
     * @return 重置密码结果
     */
    boolean resetPassword(UserInfo userInfo);

    /**
     * 获取用户信息
     * @param userName 用户名
     * @return 用户信息
     */
    UserInfo getUserInfo(String userName);
}
