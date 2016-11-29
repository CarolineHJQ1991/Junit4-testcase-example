package com.caroline.exe.suite;

import com.caroline.exe.asserts.EmployeeEmailTest;
import com.caroline.exe.enclosed.InnerClassTest;
import com.caroline.exe.parameterized.EmailUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午4:00
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({EmployeeEmailTest.class, InnerClassTest.class})
public class SuiteTest {
}
