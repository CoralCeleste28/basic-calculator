package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print(name + "'s gross pay is " + hoursWorked * payRate);

        //print only means the entry is right after versus a line below
        // Scanner scanner = new Scanner(System.in); // Makes a scanner




















    }
}