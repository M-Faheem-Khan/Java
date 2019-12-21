package com.github.m_faheem_khan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Random Number Guessing Game === \nGuess the random number between 0 and 10 inclusive");
        long randomNumber = Math.round(Math.random() * 10);
        int tries = 0; // number of tries it tok the user to figure out the random number
        Scanner scanner = new Scanner(System.in); // for reading user input
        System.out.print("Random number: ");
        int userGuess = scanner.nextInt();
        while (userGuess != randomNumber){
            tries++;
            System.out.println(("Invalid"));
            System.out.print("Random number: ");
            userGuess = scanner.nextInt();
        }
        System.out.println("Congrats you figured out the random number in " + tries + " tries");
    }
}
