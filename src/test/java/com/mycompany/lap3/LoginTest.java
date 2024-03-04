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
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of validateLogin method, of class Login.
     */
    @Test
    public void testValidUsername() {
        assertTrue(Login.isValidUsername("Thang123"));
        assertTrue(Login.isValidUsername("Manh_Thang"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(Login.isValidUsername("user"));  // Too short
        assertFalse(Login.isValidUsername("abcdefghijklmnopqrstuvwxyz"));  // Too long
        assertFalse(Login.isValidUsername("thang@123"));  // Contains special character
        assertFalse(Login.isValidUsername("thang 123"));  // Contains space
    }

    @Test
    public void testEmptyUsername() {
        assertFalse(Login.isValidUsername(""));
    }

    @Test
    public void testNullUsername() {
        assertFalse(Login.isValidUsername(null));
    }

    @Test
    public void testValidPassword() {
        assertTrue(Login.isValidPassword("Passw0rd"));
        assertTrue(Login.isValidPassword("Thang@1234"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(Login.isValidPassword("pass"));  // Too short
        assertFalse(Login.isValidPassword("ttehang"));  // No digits
        assertFalse(Login.isValidPassword("Thang@_fr"));  // No digits
    }

    @Test
    public void testEmptyPassword() {
        assertFalse(Login.isValidPassword(""));
    }

    @Test
    public void testNullPassword() {
        assertFalse(Login.isValidPassword(null));
    }
}
