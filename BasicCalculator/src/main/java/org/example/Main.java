package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Makes a Scanner named scanner. Or making a instance of the scanner class named scanner
        System.out.print("Enter first number: "); // MAKE NOTE THAT THE LN AT THE END OF PRINT MEANS NEXT LINE
        int numOne = Integer.parseInt(scanner.nextLine());  // Makes a 'new line' where user input is entered by the user. It also makes the string into an interger
        System.out.print("Enter the second number: ");
        int numTwo = Integer.parseInt(scanner.nextLine()); //
        System.out.print("""
                Possible Calculations:   
                    (A)dd
                    (S)ubtract
                    (M)ultiply
                    (D)ivide
                Please select an option:  """ + " ");
        char possibleCalc = scanner.nextLine().charAt(0);
        System.out.println(numOne + " * " + numTwo + " = " + numOne * numTwo);

    }
}