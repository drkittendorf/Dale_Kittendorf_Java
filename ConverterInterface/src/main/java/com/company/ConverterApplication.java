package com.company;

import java.util.Scanner;

public class ConverterApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month Number:");

        int userMonthNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(userMonthNumber);
    }




//    @Override
//    public String convertMonth(int monthNumber) {
//        return null;
//    }
//
//    @Override
//    public String convertDay(int dayNumber) {
//        return null;
//    }
}


// ## Exercise 1: Converter Interface
//
//1. Create your solution in an IntelliJ project called `ConverterInterface`.
//
//2. Create two implementations of the below interface.
//
//3. The first implementation must use if/else if/else statements and be called `ConverterIf`.
//
//4. The second implementation must use switch statements and be called `ConverterSwitch`.
//
//5. Create a class called `ConverterApplication` which has your main method.
//
//6. Instantiate and use both the `ConverterIf` and `ConverterSwitch` classes in that main method.
//
//7. Implement the interface of ` ConverterIf and ConverterSwitch` classes by using the code below:
//
//```java