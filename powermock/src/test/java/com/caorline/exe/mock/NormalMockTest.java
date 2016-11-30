package com.caorline.exe.mock;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import java.io.File;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午3:19
 */
public class NormalMockTest {
    @Test
    public void testCallArguementInstance() {
        File mockFile = PowerMockito.mock(File.class);

        // 只要调用mock出来的File里的exists方法,都返回true
        PowerMockito.when(mockFile.exists()).thenReturn(true);

        Mock mock = new Mock();
        boolean mockResult = mock.callArguementInstance(mockFile);
        Assert.assertTrue(mockResult);
    }
}
