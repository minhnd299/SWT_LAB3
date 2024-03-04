/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap3;


/**
 *
 * @author admin
 */
public class NameValidator {
     private static final String NAME_REGEX = "^[a-zA-Z]+(['-,.]?[a-zA-Z]+)*$";

    public static boolean validateName(String name) {
        return name != null && name.matches(NAME_REGEX);
    }

    public static boolean validateFirstName(String firstName) {
        return validateName(firstName);
    }

    public static boolean validateLastName(String lastName) {
        return validateName(lastName);
    }
}

