package com.caroline.exe.register;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午4:19
 */
public class RedisService {

    private String tempImageCode = "A2be";

    /**
     * 随机生成一个图形码
     */
    public void generate() {
        System.out.println("生成图形验证码: " + tempImageCode);
        put(tempImageCode);
    }

    /**
     * 把生成的图形码放进Redis中
     */
    public void put(String imageCode) {
        System.out.println("图形验证码放入redis中: " + imageCode);
    }

    /**
     * 返回之前生成的图形二维码
     * @return
     */
    public String get() {
        System.out.println("返回redis中的图形验证码: " + tempImageCode);

        return tempImageCode;
    }
}
