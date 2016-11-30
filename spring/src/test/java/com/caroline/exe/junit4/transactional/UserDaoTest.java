package com.caroline.exe.junit4.transactional;

import com.caroline.exe.dao.UserDao;
import com.caroline.exe.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.soap.Addressing;

import static org.junit.Assert.*;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 上午11:07
 */
public class UserDaoTest extends AbstractSpringTestCase {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser() throws Exception {
        User user = new User();
        user.setDept("defffffsdfsdfsdf");
        user.setName("car");
        user.setPhone("18888888888");
        user.setWebsite("car.jd.com");
        userDao.saveUser(user);
    }

}