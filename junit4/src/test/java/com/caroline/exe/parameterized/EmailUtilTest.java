package com.caroline.exe.parameterized;

import com.caroline.exe.AbstractTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.*; //TODO 这里为什么要用static
import java.util.Arrays;
import java.util.List;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 上午11:15
 */

@RunWith(Parameterized.class)
@Parameterized.UseParametersRunnerFactory(MyRunnerFactory.class)//TODO: 这段话不加也可以执行且没有问题。为什么还要加呢?
public class EmailUtilTest extends AbstractTest{
    private final boolean expected;
    private final String email;
    private final EmailUtil emailUtil = new EmailUtil();
    public EmailUtilTest( String email, boolean expected) {
        this.expected = expected;
        this.email = email;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> prepareData() {
        return Arrays.asList(new Object[][]{
                        {"mary@testdomain.com", true},
                        {"mary.smith@testdomain.com", true},
                        {"mary_smith123@testdomain.com", true},
                        {"mary@testdomaindotcom", false},
                        {"mary-smith@testdomain", false},
                        {"testdomain.com", false}
                }
        );
   }
    @Test
    public void testValidEmail() throws Exception {
        boolean actual = emailUtil.isValidEmail(email);
        assertThat(actual, is(equalTo(expected)));
    }

}