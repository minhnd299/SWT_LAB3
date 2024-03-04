/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap3;

/**
 *
 * @author admin
 */
public class Login {
   public static boolean isValidUsername(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }

        // Regular expression pattern for a valid username
        String regex = "^[a-zA-Z0-9_]{6,20}$";
        return username.matches(regex);
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        // Password criteria: At least 8 characters, containing a mix of letters and digits.
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9]).{8,}$";
        return password.matches(regex);
    }
}
