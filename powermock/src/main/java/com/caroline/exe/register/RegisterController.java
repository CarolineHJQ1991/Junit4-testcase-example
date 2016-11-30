package com.caroline.exe.register;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午4:05
 */
public class RegisterController {

    private RedisService redisService = new RedisService();
    /**
     * 用户注册的方法
     * @return
     */
    public String register(RegisterDTO registerDTO) {
        boolean verifyImageSuccess = verifyImageCode(registerDTO.getImageVerityCode());
        if (!verifyImageSuccess) {
            System.out.println("图形验证失败");
            return "failed";
        }
        boolean verifyPhoneSuccess = verifyPhoneSuccess(registerDTO.getPhoneVerityCode());
        if (!verifyPhoneSuccess) {
            System.out.println("手机验证码失败");
            return "failed";
        }
        // 真正的注册流程
        boolean registerSuccess = register(registerDTO.getUserName(), registerDTO.getPassword());
        if (!registerSuccess) {
            System.out.println("注册失败");
            return "failed";
        }

        return "success";
    }


    public boolean verifyImageCode(String imageCode) {
        // 从redis中拿到imageCode和我传入的进行比对
        // 传入A2be才返回true,否则返回false
        System.out.println("验证图形码");
        return redisService.get().equals(imageCode);
    }

    public boolean verifyPhoneSuccess(String phoneCode) {
        System.out.println("验证短信码");
        return true;
    }

    private boolean register(String userName, String password) {
        System.out.println("注册");
        return false;
    }
}


