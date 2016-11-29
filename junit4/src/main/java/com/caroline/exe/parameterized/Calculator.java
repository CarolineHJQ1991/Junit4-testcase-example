package com.caroline.exe.parameterized;

/**
 * User: Caroline.Han
 * Date: 2016-11-28
 * Time: 下午6:34
 */
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a,int b) throws Exception {
        if (0 == b) {
            throw new Exception("除数不能为0");
        }
        return a / b;
    }
}
