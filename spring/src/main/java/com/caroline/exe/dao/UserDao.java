package com.caroline.exe.dao;

import com.caroline.exe.model.User;
import org.guzz.jdbc.JDBCTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 上午11:02
 */

@Repository("userDao")
public class UserDao {
    //TODO:之前impl不是有直接调用GUZZ的东西吗? 为什么这里又写一次存储的过程
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUser(User user) {
        return this.jdbcTemplate.update("insert into user(name, dept, website, phone) values ('" + user.getName() + "','" + user.getDept() + "','" + user.getWebsite() + "','" + user.getPhone() + "')");
    }
}
