package com.github.m_faheem_khan;

import java.util.Scanner;

// Phone Number Formatter
// 1234567890 -> (123) 456-7890

public class Main {

    public static void main(String[] args) {
        String formattedPhoneNumber = "("; // Holds formatted string
        Scanner scanner = new Scanner(System.in); // setting up scanner
        System.out.println("=== Phone Number Formatter ==="); // prompt
        System.out.println("If anything other than integers is passed the program will crash."); // prompt
        System.out.print("Enter Phone Number without country code, spaces or hyphens (eg. 4325557890): "); // prompt
        int rawPhoneNumber = scanner.nextInt(); // reading lines
        // Check if the number is valid
        if (Integer.toString(rawPhoneNumber).length() != 10) {
            System.out.println("INVALID NUMBER"); // error prompt
        } else {
            // Formatting Phone Number
            String rawPhoneNumberString = Integer.toString(rawPhoneNumber);
            for (int i=0; i<10; i++) {
                if (i == 3){
                    formattedPhoneNumber+= ") ";
                } else if (i == 6){
                    formattedPhoneNumber += "-";
                }
                formattedPhoneNumber += String.valueOf(rawPhoneNumberString.charAt(i));
            }
        }
        System.out.println("Formatted: " + formattedPhoneNumber); // prompt - formatted Phone Number
    }
}
