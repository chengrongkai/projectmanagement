package com.crk.projectmanagement.service.impl;

import com.crk.projectmanagement.dao.UserInfoDao;
import com.crk.projectmanagement.entity.UserInfo;
import com.crk.projectmanagement.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserInfoDao userInfoDao;
    /**
     * 获取所有用户信息
     *
     * @return
     */
    @Override
    public List<UserInfo> getAllUserInfo() {
        List<UserInfo> userInfos = userInfoDao.queryUserInfo();
        return userInfos;
    }

    /**
     * 获取指定用户信息
     *
     * @param userName 用户名
     * @return
     */
    @Override
    public UserInfo getUserInfo(String userName) {
        if (null == userName){
            return null;
        }
        UserInfo userInfo = userInfoDao.queryUserInfoByUserName(userName);
        return userInfo;
    }

    /**
     * 添加一个用户
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        if (null == userInfo){
            return false;
        }
        UserInfo userInfo1 = getUserInfo(userInfo.getUserName());
        if (null != userInfo1){
            return false;
        }
        int effectNum = userInfoDao.addUserInfo(userInfo);
        if (effectNum>0){
            return true;
        }
        return false;
    }

    /**
     * 修改一个用户信息
     *
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public boolean updateUserInfo(UserInfo userInfo) {
        if (null == userInfo){
            return false;
        }
        UserInfo userInfo1 = getUserInfo(userInfo.getUserName());
        if (null == userInfo1){
            return false;
        }
        int effectNum = userInfoDao.updateUserInfoByUserName(userInfo);
        if (effectNum>0){
            return true;
        }
        return false;
    }

    /**
     * 删除一个用户信息
     *
     * @param userName 用户名
     * @return
     */
    @Override
    public boolean deleteUserInfo(String userName) {
        if (null == userName){
            return false;
        }
        UserInfo userInfo1 = getUserInfo(userName);
        if (null != userInfo1){
            return false;
        }
        int effectNum = userInfoDao.deleteUserInfoByUserName(userName);
        if (effectNum>0){
            return true;
        }
        return false;
    }
}
