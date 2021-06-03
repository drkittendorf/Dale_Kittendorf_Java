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
    @Test
    public void shouldAddTwoPositiveDoubles() {
        assertEquals(3.75, calculator.addDubs(1.25, 2.5), 4);
        assertEquals(11.1, calculator.addDubs(4.3, 6.8), 4);
    }

    @Test
    public void shouldAddTwoNegativeDoubles() {
        assertEquals(-6.75, calculator.addDubs(-5.4, -1.35), 4);
        assertEquals(-10.5, calculator.addDubs(-6.85, -3.65), 4);

    }


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

    @Test
    public void shouldSubtractTwoPositiveDoubles() {
        assertEquals(-1.25, calculator.subtractDubs(1.25, 2.5), 4);
        assertEquals(-2.5, calculator.subtractDubs(4.3, 6.8), 4);
    }

    @Test
    public void shouldSubtractTwoNegativeDoubles() {
        assertEquals(-2.69, calculator.subtractDubs(-4.05, -1.35), 4);
        assertEquals(4.32, calculator.subtractDubs(-2.69, -7.01), 4);
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
    @Test
    public void shouldMultiplyTwoPositiveDoubles() {
        assertEquals(10 , calculator.multiplyDubs(5,2));
        assertEquals(96, calculator.multiplyDubs(16,6));
    }
    @Test
    public void shouldMultiplyTwoNegativeDoubles() {
        assertEquals(10 , calculator.multiplyDubs(-5,-2));
        assertEquals(96, calculator.multiplyDubs(-16,-6));
    }
    @Test
    public void shouldMultiplyTwoMixedDoubles() {
        assertEquals(-10 , calculator.multiplyDubs(5,-2));
        assertEquals(-96, calculator.multiplyDubs(-16,6));
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

    @Test
    public void shouldDivideTwoPositiveDoubles() {
        assertEquals(2, calculator.divideDubs(4,2), 4);
        assertEquals(8, calculator.divideDubs(64,8), 4);
    }
    @Test
    public void shouldDivideTwoNegativeDoubles() {
        assertEquals(5 , calculator.divideDubs(-10,-2), 4);
        assertEquals(8, calculator.divideDubs(-64,-8), 4);
    }
    @Test
    public void shouldDivideTwoMixedDoubles() {
        assertEquals(-4 , calculator.divideDubs(8,-2), 4);
        assertEquals(-4, calculator.divideDubs(-16,4), 4);
    }


}

//arrange


//act


//assert