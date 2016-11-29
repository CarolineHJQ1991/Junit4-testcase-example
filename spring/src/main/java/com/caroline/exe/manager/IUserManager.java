package com.caroline.exe.manager;

import com.caroline.exe.model.User;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午6:14
 */
public interface IUserManager {
    User getUserById(int id);
    boolean insert(User user);
}
