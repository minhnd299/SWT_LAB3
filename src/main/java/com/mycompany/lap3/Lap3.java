/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lap3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class Lap3 {

    public List<String> search(String query, List<String> documents) {
    List<String> results = new ArrayList<>();

    for (String document : documents) {
      if (document.contains(query)) {
        results.add(document);
      }
    }

    return results;
  }
    public long get(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be non-negative");
    }

    if (n == 0 || n == 1) {
      return n;
    }

    long a = 0;
    long b = 1;
    long c = 0;

    for (int i = 2; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }

    return c;
  }
    //----------------------------------------------------------------------------------
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        
        return day <= daysInMonth[month];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
