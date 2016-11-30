package com.caorline.exe.mock;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午3:16
 */
public class MockSystemFinalAndStaticMethodTest extends AbstractMockRunner{

    @Test
    @PrepareForTest(Mock.class)
    public void testCallSystemFinalAndStaticMethod() {
        // mock system final
        String mockStr = PowerMockito.mock(String.class);

        PowerMockito.when(mockStr.isEmpty()).thenReturn(true);

        Mock mock = new Mock();
        Assert.assertTrue(mock.callSystemFinalMethod(mockStr));

        // mock system static
        PowerMockito.mockStatic(System.class);
        PowerMockito.when(System.getProperty("aaa")).thenReturn("bbb");

        Assert.assertEquals("bbb", mock.callSystemStaticMethod("aaa"));
        // verify 调用了1次
        PowerMockito.verifyStatic(Mockito.times(1));

        System.getProperty("aaa");
    }
}
