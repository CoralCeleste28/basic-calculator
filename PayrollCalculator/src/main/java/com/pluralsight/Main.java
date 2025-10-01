package com.pluralsight;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Makes a scanner and has it read the input

        System.out.print("What do you want to do (add, subtract) ? ");
        String command = scanner.nextLine(); // command == scanner reading user input in the next line

        if (command.equals("add")) { // if user input is add
            doAdd(scanner); // tells the computer to do the doAdd method listed below and passes in the scanner
        }
        else if (command.equals("subtract")) { // if user input is subtract
            doSubtract(scanner); // tells computer to do the doSubtract method below
        }
        else { // if user input is anything else
            System.out.printf("%s -- Invalid command!", command);
            // print f formats the String
            // %s formats the string to the user input
        }
    }

    public static void doAdd(Scanner scanner) { // Method named doAdd. (Data type variable name)
        System.out.print("Enter 1st number: ");
        double num1 = Double.parseDouble(scanner.nextLine()); // num1 is equal to the user input. Scan the next line and turn the input into a double

        System.out.print("Enter 2nd number: ");
        double num2 = Double.parseDouble(scanner.nextLine()); // num2 is equal scan the line for a double. Scan the next line and turn the input into a double

        double sum = num1 + num2; // sum is equal to num1 + num2
        System.out.printf("%f + %f = %f", num1, num2, sum); //printf means you are formatting the values
        // %f formats the value to print in float format
    }

    public static void doSubtract(Scanner scanner) {  // Method named doSubtract (
        System.out.print("Enter 1st number: ");
        double num1 = Double.parseDouble(scanner.nextLine()); // num1 is equal to the user input. Scan the next line and turn the input into a double

        System.out.print("Enter 2nd number: ");
        double num2 = Double.parseDouble(scanner.nextLine()); // num2 is equal to the user input. Scan the next line and turn the input into a double

        double difference = num1 - num2; // difference is equal to num1 - num2
        System.out.printf("%f + %f = %f", num1, num2, difference); //printf means you are formatting the values
    }   // %f formats the value to print in float format
}











