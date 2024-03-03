package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
// Trey Bruton

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        String entry = scanner.nextLine(); // this is what creates the menu entry
        if ("Addition".equals(entry)) { // user will enter "addition" and menu will ask for two doubles
            System.out.println("Type your first number.");
            Scanner addscanner = new Scanner(System.in);
            int addition = addscanner.nextInt();
            System.out.println("Type your second number.");
            int addition2 = scanner.nextInt();
            System.out.println(addition + addition2);
        } else if ("Subtraction".equals(entry)) {
            System.out.println("Type your first number.");
            Scanner subtractscanner = new Scanner(System.in);
            int subtract = subtractscanner.nextInt();
            System.out.println("Type your second number.");
            int subtract2 = scanner.nextInt();
            System.out.println(subtract - subtract2);
        } else if ("Multiplication".equals(entry)) {
            System.out.println("Type your first number.");
            Scanner multiplyscanner = new Scanner(System.in);
            int multiply = multiplyscanner.nextInt();
            System.out.println("Type your second number.");
            int multiply2 = scanner.nextInt();
            System.out.println(multiply * multiply2);
        }
        else if ("Division".equals(entry)) {
            System.out.println("Type your first number.");
            Scanner dividescanner = new Scanner(System.in);
            int divide = dividescanner.nextInt();
            System.out.println("Type your second number.");
            int divide2 = scanner.nextInt();
            System.out.println(divide / divide2);}
        else if ("Squareroot".equals(entry)) {
            System.out.println("Type the number you would like the square root of.");
            Scanner squarescanner = new Scanner(System.in);
            int square = squarescanner.nextInt();
            System.out.println(Math.sqrt(square));}
        else {
            System.out.println("Error!");
        }
    }
}
    /* public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current number?");
        double value = scanner.nextDouble();
        return value; */

// Trey Bruton