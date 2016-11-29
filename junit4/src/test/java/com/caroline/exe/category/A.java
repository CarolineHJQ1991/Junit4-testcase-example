package com.caroline.exe.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午4:27
 */
public class A {

    @Test
    public void a() {
        System.out.println("this is A.a");
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
        System.out.println("this is A.b");
    }
}
