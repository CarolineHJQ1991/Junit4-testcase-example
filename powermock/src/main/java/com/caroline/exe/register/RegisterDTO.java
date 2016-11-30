package com.caroline.exe.register;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 下午3:54
 */
public class RegisterDTO {

    //用户名
    private String userName;
    //密码
    private String password;
    //短信验证码
    private String phoneVerityCode;
    //图形验证码
    private String imageVerityCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneVerityCode() {
        return phoneVerityCode;
    }

    public void setPhoneVerityCode(String phoneVerityCode) {
        this.phoneVerityCode = phoneVerityCode;
    }

    public String getImageVerityCode() {
        return imageVerityCode;
    }

    public void setImageVerityCode(String imageVerityCode) {
        this.imageVerityCode = imageVerityCode;
    }


}
