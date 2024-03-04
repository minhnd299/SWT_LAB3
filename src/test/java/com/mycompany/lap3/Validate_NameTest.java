package com.mycompany.lap3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 *
 * @author admin
 */
public class Validate_NameTest {
    
    public Validate_NameTest() {
    }

    /**
     * Test of isValidName method, of class Validate_Name.
     */
    @Test
    public void testValidateName() {
        assertTrue(NameValidator.validateName("Thang"));
        assertTrue(NameValidator.validateName("ThangNM"));

        assertFalse(NameValidator.validateName("123"));
        assertFalse(NameValidator.validateName(""));
        assertFalse(NameValidator.validateName(null));
    }

    @Test
    public void testValidateFirstName() {
        assertTrue(NameValidator.validateFirstName("Manh"));
        assertTrue(NameValidator.validateFirstName("Nguyen"));
        assertTrue(NameValidator.validateFirstName("Tran"));

        assertFalse(NameValidator.validateFirstName("123"));
        assertFalse(NameValidator.validateFirstName(""));
        assertFalse(NameValidator.validateFirstName(null));
    }

    @Test
    public void testValidateLastName() {
        assertTrue(NameValidator.validateLastName("Trieu"));
        assertTrue(NameValidator.validateLastName("Hung"));
        assertTrue(NameValidator.validateLastName("Oshs"));

        assertFalse(NameValidator.validateLastName("123"));
        assertFalse(NameValidator.validateLastName(""));
        assertFalse(NameValidator.validateLastName(null));
    }
    
}
