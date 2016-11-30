package com.caroline.exe.mock;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午3:14
 */

@PrepareForTest(Mock.class)
public class MockStaticMethodTest extends AbstractMockRunner{
    @Test
    public void testStaticMethod() {
        PowerMockito.mockStatic(Mock.class);

        PowerMockito.when(Mock.isMan()).thenReturn(true);

        Assert.assertTrue(Mock.isMan());
    }

    @Test(expected = RuntimeException.class)
    public void testThrowException() {
        PowerMockito.mockStatic(Mock.class);

        System.out.println("prepare throw exception");

        PowerMockito.doThrow(new RuntimeException()).when(Mock.isMan());

        Mock.isMan();
    }
}
