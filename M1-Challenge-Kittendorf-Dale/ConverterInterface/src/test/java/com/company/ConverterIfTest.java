package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    private ConverterIf ConverterIf;


    @Before
    public void setUp() {
        ConverterIf = new ConverterIf();

    }

    @Test
    public void shouldReturnNameOfMonth() {
        String whatIExpect = "January";
        String whatIGot = ConverterIf.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayOfWeek() {

        String whatIExpect = "Monday";
        String whatIGot = ConverterIf.convertDay(1);
        assertEquals(whatIExpect, whatIGot);

    }

    @Test
    public void shouldReturnNameOfAnotherMonth() {
        String whatIExpect = "March";
        String whatIGot = ConverterIf.convertMonth(3);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayOfAnotherWeek() {

        String whatIExpect = "Friday";
        String whatIGot = ConverterIf.convertDay(5);
        assertEquals(whatIExpect, whatIGot);

    }

}



