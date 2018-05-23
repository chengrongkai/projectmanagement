package com.crk.projectmanagement.service.service;

import com.crk.projectmanagement.entity.UserInfo;

import java.util.List;
/**
 * @Author: 程荣凯
 * @Date: 2018/5/23 14:54
 */
public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<UserInfo> getAllUserInfo();

    /**
     * 获取指定用户信息
     * @param userName 用户名
     * @return
     */
    UserInfo getUserInfo(String userName);

    /**
     * 添加一个用户
     * @param userInfo 用户信息
     * @return
     */
    boolean addUserInfo(UserInfo userInfo);

    /**
     * 修改一个用户信息
     * @param userInfo 用户信息
     * @return
     */
    boolean updateUserInfo(UserInfo userInfo);

    /**
     * 删除一个用户信息
     * @param userName 用户名
     * @return
     */
    boolean deleteUserInfo(String userName);
}
