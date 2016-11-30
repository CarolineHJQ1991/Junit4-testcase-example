package com.caroline.exe.register;

import com.caroline.exe.mock.AbstractMockRunner;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import sun.jvm.hotspot.asm.Register;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午4:32
 */
//TODO:两个类全部失败,baby的代码验证码值都不对。是怎么通过测试的。
@PrepareForTest(RegisterController.class)
public class MockRegisterTest extends AbstractMockRunner{

    @Test
    public void testRegister() {
        RegisterDTO registerDTO = constructInstance();//TODO:这里为什么就会想到写这个constructInstance()
        RegisterController mockController = PowerMockito.spy(new RegisterController());
        PowerMockito.when(mockController.verifyImageCode("A2be")).then(a -> {
            System.out.println("验证图形码成功");//TODO: 这里明明1234不是注册流程里的验证码,为什么还会返回成功
            return true;
        });
        //PowerMockito.when(mockController.verifyImageCode("1234")).thenReturn(true);

        String result = mockController.register(registerDTO);
        Assert.assertEquals("success", result);
    }

    @Test
    public void testRegister2() throws Exception {
        RegisterDTO registerDTO = constructInstance();
        RegisterController mockController = PowerMock.createPartialMock(RegisterController.class, "verifyImageCode");
        // 调用register方法的时候,它调用了此类的其他方法(verifyImageCode),得使用expectPrivate
        PowerMock.expectPrivate(mockController, "verifyImageCode", "1234").andAnswer(() -> {
            System.out.println("验证图形码成功");
            return true;
        });
        PowerMock.replay(mockController);

        String result = mockController.register(registerDTO);
        Assert.assertEquals("success", result);
    }
    private RegisterDTO constructInstance() {
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setUserName("caroline");
        registerDTO.setPassword("wheet123");
        registerDTO.setPhoneVerityCode("1233");
        registerDTO.setImageVerityCode("A2be");
        return registerDTO;
    }
}
