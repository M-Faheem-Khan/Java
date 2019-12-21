package com.github.m_faheem_khan;

import java.util.Arrays;

// Problem: http://rosettacode.org/wiki/100_doors

public class Main {

    public static void main(String[] args) {
        int[] Doors = new int[100]; // array
        // Populating Doors
        Arrays.fill(Doors, 0);

        // Door States
        // 0 - Closed
        // 1 - Open

        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i > 0) { // check to see the mod interger is > 0 to prevent divide by 0 error
                    if ((j % i) == 0) { // checking if the integer is
                        // Toggling Door
                        // if door is closed
                        if (Doors[j] == 0) {
                            Doors[j] = 1;
                        } else { // if door is open
                            Doors[j] = 0;
                        }
                    }
                }
            }
        }

        // Printing Index of Closed Doors
        for (int i = 0; i < 100; i++) {
            if (Doors[i] == 1) {
                System.out.println("Door Closed at index: " + i); // printing index of door
            }
        }

        // Printing Doors
        for (int i = 0; i < 100; i++) {
            System.out.print(Doors[i] + ", "); // printing door
        }
        System.out.println();
    }
}
