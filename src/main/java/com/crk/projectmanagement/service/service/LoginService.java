package com.crk.projectmanagement.service.service;

import com.crk.projectmanagement.entity.UserInfo;

public interface LoginService {
    boolean login(UserInfo userInfo);
    boolean register(UserInfo userInfo);
    boolean resetPassword(UserInfo userInfo);
    UserInfo getUserInfo(String userName);
}
