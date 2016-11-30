package com.caorline.exe.mock;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午2:59
 */

//TODO: 总的来说,整个Mock下面写的东西,我都不知道思维前后顺序。就不知道写了个啥?
public class MockFinalMethodTest extends AbstractMockRunner {

    @Test
    @PrepareForTest(Mock.class)
    //TODO: 为什么这里有的方法需要抛异常,有的不需要
    public void testCallFinalMethod() {
        Mock mock = PowerMockito.mock(Mock.class);

        PowerMockito.when(mock.isAlive()).thenReturn(true);

        Assert.assertTrue(mock.isAlive());
    }
}
