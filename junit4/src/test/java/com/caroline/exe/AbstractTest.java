package com.caroline.exe;

import org.junit.*;

/**
 * User: Caroline.Han
 * Date: 2016-11-28
 * Time: 下午5:25
 */
public abstract class AbstractTest extends Assert{
    @BeforeClass
    public static void onTimeSetUp() {
        System.out.println("JUnit @BeforeClass onTimeSetUp");
    }

    @Before
    public void setUp() {
        System.out.println("JUnit @Before setup");
    }

    @After
    public void destroy() {
        System.out.println("JUnit @After destroy");
    }

    @AfterClass
    public static void onTimeDestroy() {
        System.out.println("JUnit @AfterClass destroy");
    }
}
