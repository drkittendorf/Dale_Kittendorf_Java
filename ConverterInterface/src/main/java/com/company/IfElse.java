package com.company;

public class IfElse implements Converter{

    public String convertMonth(int monthNumber) {
        if (monthNumber == 1) {
            return "January";
        }

    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            return "Monday";
        }
    }
}