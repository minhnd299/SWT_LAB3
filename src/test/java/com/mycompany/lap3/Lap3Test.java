/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lap3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class Lap3Test {
    
    public Lap3Test() {
    }

    /**
     * Test of get method, of class Lap3.
     */
    @Test
    public void testSearch() {
    Lap3 search = new Lap3();

    List<String> documents = Arrays.asList("The book of lazy dog", "The cat sat on the mat");

    List<String> results = search.search("dog", documents);

    assertEquals(1, results.size());
    assertEquals("The book of lazy dog", results.get(0));
  }
    @Test
    public void testFibonacci() {
        Lap3 fibonacci = new Lap3();

        assertEquals(0, fibonacci.get(0));
        assertEquals(1, fibonacci.get(1));
        assertEquals(1, fibonacci.get(2));
        assertEquals(2, fibonacci.get(3));
        assertEquals(3, fibonacci.get(4));
        assertEquals(5, fibonacci.get(5));             
        assertEquals(8, fibonacci.get(6));
        assertEquals(13, fibonacci.get(7));
        assertEquals(21, fibonacci.get(8));
        assertEquals(34, fibonacci.get(9));

        try {
            fibonacci.get(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    
    }
    
    @Test
    public void testValidDate() {
        assertTrue(Lap3.isValidDate(2023, 11, 6)); // Valid date
        assertTrue(Lap3.isValidDate(2020, 2, 29));  // Leap year
        assertFalse(Lap3.isValidDate(2023, 2, 29)); // Not a leap year
        assertFalse(Lap3.isValidDate(2023, 13, 6)); // Invalid month
        assertFalse(Lap3.isValidDate(2023, 11, -1)); // Negative day
    }

    @Test
    public void testLeapYear() {
        assertTrue(Lap3.isLeapYear(2000));  // Leap year
        assertTrue(Lap3.isLeapYear(2024));  // Leap year
        assertFalse(Lap3.isLeapYear(2023)); // Not a leap year
        assertFalse(Lap3.isLeapYear(1900)); // Not a leap year
    }
    
    

}
