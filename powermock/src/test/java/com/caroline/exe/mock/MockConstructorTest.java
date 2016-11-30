package com.caroline.exe.mock;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.io.File;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午0:03
 */

public class MockConstructorTest extends AbstractMockRunner{
    @Test
    @PrepareForTest(Mock.class)
    public void callInternalInstance() throws Exception {
        //构造一个mock出来的File对象  TODO:这个PowerMockito是个什么东西
        File mockFile = PowerMockito.mock(File.class);
        //当调用exists方法,始终返回true
        PowerMockito.when(mockFile.exists()).thenReturn(true);
        //当构造File对象并且参数传的是bbb时,始终返回mock出来的File对象
        PowerMockito.whenNew(File.class).withArguments("bbb").thenReturn(mockFile);

        Mock mock = new Mock();
        boolean mockResult = mock.callInternalInstance("bbb");

        Assert.assertTrue(mockResult);
    }

}