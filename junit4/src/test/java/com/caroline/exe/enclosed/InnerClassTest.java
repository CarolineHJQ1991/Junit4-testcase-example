package com.caroline.exe.enclosed;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午3:51
 */
@RunWith(Enclosed.class)
public class InnerClassTest {

    public static class MyInnerClass {// TODO:为什么这个类是static的
        @Test
        public void testInnerClassMethod() {
           System.out.println("this is inner class method");
       }
    }

    public static class MyInnerClass2 {
        @Test
        public void testInnerClassMethod2() {
            System.out.println("this is inner class method2");
        }
    }

    public static class MyInnerClass3 {
        @Test
        public void testInnerClassMethod3() {
            System.out.println("this is inner class method3");
        }
    }
}
