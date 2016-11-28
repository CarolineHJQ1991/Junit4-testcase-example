package com.caroline.exe.asserts;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * User: Caroline.Han
 * Date: 2016-11-28
 * Time: 下午2:16
 */
public class EmployeeEmail {
    public final Map<String, String>  emailMap = new HashMap();
    public void addEmployEmail(String id, String email) {
        if (isValidateEmail(email)) {
            emailMap.put(id, email);
        }
    }

    public boolean isValidateEmail(String email) {
        String regex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        return Pattern.compile(regex).matcher(email).matches();
    }
}
