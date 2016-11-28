package com.caroline.exe.asserts;


import com.caroline.exe.AbstractTest;
import org.junit.Test;

/**
 * User: Caroline.Han
 * Date: 2016-11-28
 * Time: 下午5:08
 */
public class EmployeeEmailTest extends AbstractTest {

    @Test
    public void addEmployEmail() throws Exception {
        EmployeeEmail employeeEmail = new EmployeeEmail();
        employeeEmail.addEmployEmail("em1", "123@gmail.com");
        employeeEmail.addEmployEmail("em2", "456@gmail.com");

        assertEquals("Incorrect Collection Size", 2, employeeEmail.emailMap.size());
        employeeEmail.addEmployEmail("em2", "6678@gmail.com");
        assertNotEquals("Duplicate key in collection", 3, employeeEmail.emailMap.size());
    }


    @Test
    public void isValidateEmail() throws Exception {
        EmployeeEmail employeeEmail = new EmployeeEmail();
        boolean isValid1 = employeeEmail.isValidateEmail("123@gmail.com");
        assertTrue(isValid1);

        boolean isInvalid1 = employeeEmail.isValidateEmail("1234@dadad");
        assertFalse(isInvalid1);

        boolean isInvalid2 = employeeEmail.isValidateEmail("234234$&*(@sina.com");
        assertFalse(isInvalid2);
    }


}