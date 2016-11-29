package com.caroline.exe.parameterized;

import com.caroline.exe.AbstractTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午2:25
 */
@RunWith(Parameterized.class) //TODO: 参数化有什么好处跟优势呢?
public class EmailUtilTest2 extends AbstractTest{//TODO:为什么总是要继承这个东西。
    @Parameterized.Parameter(1)
    public boolean expected;
    //private final boolean expected; //TODO: 为什么final必须得有构造函数
    @Parameterized.Parameter
    public String email;

    @Parameterized.Parameters
    public static Iterable<Object[]> prepareData() {
        return Arrays.asList(new Object[][]{
                {"mary@testdomain.com", true},
                {"mary.smith@testdomain.com", true},
                {"mary_smith123@testdomain.com", true},
                {"mary@testdomaindotcom", false},
                {"mary-smith@testdomain", false},
                {"testdomain.com", false}

        });
    }
    @Test
    public void testValidEmail() throws Exception {
        boolean actual = EmailUtil.isValidEmail(email);
        assertThat(actual, is(equalTo(expected)));
    }
}
