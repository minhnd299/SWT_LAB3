/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap3;

/**
 *
 * @author admin
 */
public class Register {
    public static boolean validateRegister(String gmail, String username, String password, String phone) {
        // Check if all fields are empty
        if (gmail.isEmpty() || username.isEmpty() || password.isEmpty() || phone.isEmpty()) {
            return false;
        }

        // Check if Gmail is valid
        if (!gmail.matches("^[a-zA-Z0-9._%+-]+@gmail.com$")) {
            return false;
        }

        // Check if username is valid
        if (!username.matches("^[a-zA-Z0-9_]{6,20}$")) {
            return false;
        }

        // Check if password is valid
        if (!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9]).{8,}$")) {
            return false;
        }

        // Check if phone is valid
        if (!phone.matches("^\\+(?:84)\\d{9}$")) {
            return false;
        }

        return true;
    }

    
}
