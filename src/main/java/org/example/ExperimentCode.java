package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Iterator;

import static org.example.Quiz.userMadeTest;

public class ExperimentCode {

    /** This is a playground for bits of code I want to get working properly before putting them in program **/

    public static void playground1() {
        Scanner input = new Scanner(System.in);

        /** Is this the solution to the trapper code? I have been trying to force a user into entering a specific input and think this might be the answer to force that. **/

        String looper;
        boolean b = true;
        int count = 1;

        do {
            System.out.println("\nEnter 1 to escape the loop. Enter 2 to remain. Try another entry if you wish.\n");

            while (!input.hasNextInt()) {
                System.out.println("Please enter 1 or 2");
                input.nextLine();
            }
            looper = input.nextLine();

            if (Objects.equals(looper, "1")) {
                System.out.println("You are free to go. You have been in this loop " + count + " times.");
                b = false;
            } else if (Objects.equals(looper, "2")) {
                System.out.println("You choose to stay.");
                count++;
            } else {
                System.out.println("You entered an invalid input. Stay in the loop again.");
                count++;
            }

        } while (b);



    }
}
