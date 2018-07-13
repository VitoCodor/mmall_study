package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Vito on 2018/7/12.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
