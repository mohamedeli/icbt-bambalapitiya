/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testautomation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohamed Ali
 */
public class calculatorTest {
    
    public calculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 3;
        int no2 = 5;
        int expResult = 8;
        int result = calculator.add(no1, no2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of sub method, of class calculator.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int no1 = 8;
        int no2 = 3;
        int expResult = 5;
        int result = calculator.sub(no1, no2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mutiply method, of class calculator.
     */
    @Test
    public void testMutiply() {
        System.out.println("mutiply");
        int no1 = 3;
        int no2 = 4;
        int expResult = 12;
        int result = calculator.mutiply(no1, no2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of divid method, of class calculator.
     */
    @Test
    public void testDivid() {
        System.out.println("divid");
        int no1 = 8;
        int no2 = 4;
        int expResult = 2;
        int result = calculator.divid(no1, no2);
        assertEquals(expResult, result);
        
    }
    
}
