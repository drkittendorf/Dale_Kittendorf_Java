package com.company;
import java.util.Scanner;

public class ConverterApplication {


    public static void main(String[] args) {
        ConverterIf ConverterIf;
        ConverterSwitch ConverterSwitch;
        ConverterIf = new ConverterIf();
        ConverterSwitch = new ConverterSwitch();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Number you would like the If/Else Converter to convert to a Month: " );
        // return month from switch
        int ifMonth = Integer.parseInt(scanner.nextLine());
        System.out.println("Your requested month is: " + ConverterIf.convertMonth(ifMonth) + "\n");
        // enter day number
        System.out.println("Please enter the Number for the If/Else Converter to convert to a Day:");
        int ifDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Your requested day is: " + ConverterIf.convertDay(ifDay) + "\n");
        // return day from switch
        System.out.println("Please enter the Number you would like the Switch Converter to convert to a Month: ");
        int switchMonth = Integer.parseInt(scanner.nextLine());
        System.out.println("Your requested month is: " + ConverterSwitch.convertMonth(switchMonth) + "\n");
        // return month from if
        // enter day number
        System.out.println("Please enter the Number for the Switch Converter to convert to a Day:");
        int switchDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Your requested day is: " + ConverterSwitch.convertDay(switchDay) + "\n");
        // return day from if
        System.out.println("Thank You for your participation...rerun to play again");
    }

}
