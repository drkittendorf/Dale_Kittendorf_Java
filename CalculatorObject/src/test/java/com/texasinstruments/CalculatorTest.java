package com.texasinstruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void preTest() {
        calculator = new Calculator();
    }

//Addition tests
    @Test
    public void shouldAddTwoPositiveIntegers() {
        assertEquals(3 , calculator.add(1,2));
        assertEquals(10, calculator.add(4,6));
    }
    @Test
    public void shouldAddTwoNegativeIntegers() {
        assertEquals(-6, calculator.add(-5, -1));
        assertEquals(-9, calculator.add(-6, -3));
    }
//    @Test
//    public void shouldAddTwoPositiveDoubles() {
//        assertEquals(double 3.75 , calculator.addDubs(1.25, 2.5));
//        assertEquals(double 11.1 , calculator.addDubs(4.3, 6.8));
//    }

//    @Test
//    public void shouldAddTwoNegativeDoubles() {
//        assertEquals(-6, calculator.add(-5, -1));
//        assertEquals(-9, calculator.add(-6, -3));
//    }


//Subtract Tests
    @Test
    public void shouldSubtractTwoPositiveIntegers() {
        assertEquals(3 , calculator.subtract(5,2));
        assertEquals(10, calculator.subtract(16,6));
    }

    @Test
    public void shouldSubtractTwoNegativeIntegers() {
        assertEquals(-1, calculator.subtract(-6, -5));
        assertEquals(-4, calculator.subtract(-5, -1));
    }

    @Test
    public void shouldSubtractTwoMixedIntegers() {
        assertEquals(-20, calculator.subtract(-5, 15));
        assertEquals(31, calculator.subtract(20, -11));
    }
// Multiply Tests
    @Test
    public void shouldMultiplyTwoPositiveIntegers() {
        assertEquals(10 , calculator.multiply(5,2));
        assertEquals(96, calculator.multiply(16,6));
    }
    @Test
    public void shouldMultiplyTwoNegativeIntegers() {
        assertEquals(10 , calculator.multiply(-5,-2));
        assertEquals(96, calculator.multiply(-16,-6));
    }
    @Test
    public void shouldMultiplyTwoMixedIntegers() {
        assertEquals(-10 , calculator.multiply(5,-2));
        assertEquals(-96, calculator.multiply(-16,6));
    }
 //Division Tests
  @Test
    public void shouldDivideTwoPositiveIntegers() {
        assertEquals(2 , calculator.divide(4,2));
        assertEquals(8, calculator.divide(64,8));
    }
    @Test
    public void shouldDivideTwoNegativeIntegers() {
        assertEquals(5 , calculator.divide(-10,-2));
        assertEquals(8, calculator.divide(-64,-8));
    }
    @Test
    public void shouldDivideTwoMixedIntegers() {
        assertEquals(-4 , calculator.divide(8,-2));
        assertEquals(-4, calculator.divide(-16,4));
    }




}

//arrange


//act


//assert