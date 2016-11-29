package com.caroline.exe.manager.impl;

import com.caroline.exe.manager.IUserManager;
import com.caroline.exe.model.User;
import org.guzz.dao.GuzzBaseDao;
import org.guzz.orm.se.SearchExpression;
import org.guzz.orm.se.Terms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午6:16
 */
@Service
public class UserManagerImpl implements IUserManager{

    @Autowired
    private GuzzBaseDao guzzBaseDao;
    @Override
    public User getUserById(int id) {
        System.out.println("get user by id: " + id);
        SearchExpression searchExpression = SearchExpression.forBusiness("user");
        searchExpression.and(Terms.eq("id", id));
        return (User) guzzBaseDao.findObject(searchExpression);
    }

    @Override
    public boolean insert(User user) {
        try {
            guzzBaseDao.insert(user);   //TODO: 为什么在这里的时候本来是没有异常抛出的,但是为什么还要加一个try
        }catch (Exception e) {
            System.out.println("insert user error, message is " + e.getMessage());
            return false;
        }
        return true;
    }
}
