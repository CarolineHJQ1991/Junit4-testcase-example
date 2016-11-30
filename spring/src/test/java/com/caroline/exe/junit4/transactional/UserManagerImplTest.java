package com.caroline.exe.junit4.transactional;

import com.caroline.exe.manager.IUserManager;
import com.caroline.exe.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 上午10:42
 */
public class UserManagerImplTest extends AbstractSpringTestCase {

    @Autowired
    private IUserManager userManager;
    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setDept("abc");
        user.setName("ben");
        user.setPhone("18888888888");
        user.setWebsite("ben.jd.com");
        userManager.insert(user);
    }

}