package com.caroline.exe.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午4:31
 */
@Category({SlowTests.class, FastTests.class})
//TODO: 这个分类又是slow,又是Fast。到底是哪个
public class B {

    @Test
    public void c() {
        System.out.println("this is B.c");
    }
}
