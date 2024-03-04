/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lap3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class RegisterTest {
    
    public RegisterTest() {
    }

    @Test
    void testValidRegister() {
        assertEquals(true, Register.validateRegister("thang1234@gmail.com", "ManhThang89", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterEmptyGmail() {
        assertEquals(false, Register.validateRegister("", "thangnmhe1", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterEmptyUsername() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterEmptyPassword() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "thangnnn1", "", "+84988888888"));
    }

    @Test
    void testInvalidRegisterEmptyPhone() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "thangnnn13", "StrongPassword123!", ""));
    }

    @Test
    void testInvalidRegisterInvalidGmail() {
        assertEquals(false, Register.validateRegister("thang@gmail", "thangnnn2", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterInvalidUsername() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "tn1-username", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterInvalidPassword() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "thangnnn145", "weakpassword", "+84988888888"));
    }

    @Test
    void testInvalidRegisterInvalidPhone() {
        assertEquals(false, Register.validateRegister("thang@gmail.com", "thangnnn1", "StrongPassword123!", "15555555555"));
    }

    @Test
    void testInvalidRegisterExistingGmail() {
        assertEquals(false, Register.validateRegister("thang22-gmail@example.com", "thangnnn152352", "StrongPassword123!", "+84988888888"));
    }

    @Test
    void testInvalidRegisterExistingUsername() {
        assertEquals(false, Register.validateRegister("example@gmail.com", "existing-username", "StrongPassword123!", "+84988888888"));
    }
    
    
    
}
