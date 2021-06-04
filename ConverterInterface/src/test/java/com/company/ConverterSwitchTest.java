package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    private ConverterSwitch ConverterSwitch;

    @Before
    public void setUp() {
        ConverterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnMonthByName() {
        String whatIExpect = "January";
        String whatIGot = ConverterSwitch.convertMonth(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayOfWeek() {
        String whatIExpect = "Monday";
        String whatIGot = ConverterSwitch.convertDay(1);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnNameOfAnotherMonth() {
        String whatIExpect = "November";
        String whatIGot = ConverterSwitch.convertMonth(11);
        assertEquals(whatIExpect, whatIGot);
    }

    @Test
    public void shouldReturnDayOfAnotherWeek() {

        String whatIExpect = "Thursday";
        String whatIGot = ConverterSwitch.convertDay(4);
        assertEquals(whatIExpect, whatIGot);

    }




}