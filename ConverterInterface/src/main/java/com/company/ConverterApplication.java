package com.company;
import java.util.Scanner;

public class ConverterApplication {


    public static void main(String[] args) {
        ConverterIf ConverterIf;
        ConverterSwitch ConverterSwitch;
        ConverterIf = new ConverterIf();
        ConverterSwitch = new ConverterSwitch();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the MONTH Number for the If/Else to convert:");
        // return month from switch
        int ifMonth = Integer.parseInt(scanner.nextLine());
        System.out.println(ConverterIf.convertMonth(ifMonth));
        // enter day number
        System.out.println("Please enter the DAY Number for the If/Else to convert:");
        int ifDay = Integer.parseInt(scanner.nextLine());
        System.out.println(ConverterIf.convertDay(ifDay));
        // return day from switch
        System.out.println("Please enter the MONTH Number for the Switch to convert:");
        int switchMonth = Integer.parseInt(scanner.nextLine());
        System.out.println(ConverterSwitch.convertMonth(switchMonth));
        // return month from if
        // enter day number
        System.out.println("Please enter the DAY Number for the Switch to convert:");
        int switchDay = Integer.parseInt(scanner.nextLine());
        System.out.println(ConverterSwitch.convertDay(switchDay));
        // return day from if

    }

}
