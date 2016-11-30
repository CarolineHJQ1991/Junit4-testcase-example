package com.caroline.exe.mock;

import com.caroline.exe.action.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午5:46
 */
public class UserControllerOldTest {

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
        //安装userController依赖,比如userService
    }

    @Test
    public void testView() {
        //TODO: 为什么这个没有启动任何tomcat就可以测试通过
        MockHttpServletRequest request = new MockHttpServletRequest();
        ModelAndView mv = userController.view(1L, request);

        ModelAndViewAssert.assertViewName(mv, "user/view");
        ModelAndViewAssert.assertModelAttributeAvailable(mv, "user");
    }
}
