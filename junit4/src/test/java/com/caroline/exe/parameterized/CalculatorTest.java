package com.caroline.exe.parameterized;

import com.caroline.exe.AbstractTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * User: Caroline.Han
 * Date: 2016-11-28
 * Time: 下午6:38
 */
@RunWith(Parameterized.class) //TODO 这里为什么要加一个runwith
public class CalculatorTest extends AbstractTest{
    private final int expected;
    private final int input1;
    private final int input2;
    private final Calculator calculator = new Calculator();


    public CalculatorTest(int expected, int input1, int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Parameterized.Parameters
    public static Collection prepareData() {
        Object[][] objects = {{3, 2, 2},{-4, -1, -3},{5, 2, 3},{4, -4, 8}};
        return Arrays.asList(objects);//TODO 这些数据是做什么的,一定要是这个返回值吗?
    }
    @Test
    public void testAdd() throws Exception {
        assertEquals(this.expected, calculator.add(input1, input2));
    }//TODO 她怎么就会调用上面返回的值呢?


}