package com.crk.projectmanagement.dao;

import com.crk.projectmanagement.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    /**
     * 查询所有用户信息
     * @return
     */
     List<UserInfo> queryUserInfo();

    /**
     * 根据用户名查询用户信息
     * @param userName 用户名
     * @return
     */
     UserInfo queryUserInfoByUserName(String userName);

    /**
     * 新增用户信息
     * @param userInfo 用户信息
     * @return
     */
     int addUserInfo(UserInfo userInfo);

    /**
     * 修改用户信息
     * @param userInfo 用户信息
     * @return
     */
     int updateUserInfoByUserName(UserInfo userInfo);

    /**
     * 根据用户名删除用户信息
     * @param userName 用户名
     * @return
     */
     int deleteUserInfoByUserName(String userName);
}
