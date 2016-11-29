package com.caroline.exe.parameterized;

import java.util.regex.Pattern;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 上午11:01
 */
public class EmailUtil {

    public static String createEmail(String firstPart, String secondPart) {
        return firstPart + "." + secondPart + "@testdomain.com";
    }

    public static boolean isValidEmail(String email) {
        String regex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        return Pattern.compile(regex).matcher(email).matches();
    }
}
