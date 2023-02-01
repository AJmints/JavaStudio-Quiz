package org.example;

import java.util.Objects;
import java.util.Scanner;

public class ExperimentCode {

    /** This is a playground for bits of code I want to get working properly before putting them in program **/

    public void playground (String[] args) {
        Scanner input = new Scanner(System.in);


        /** This code needs to trap the user in a loop that can only be escaped by the user entering 1 or 2 and having the prompts come up in the proper order. There are many instances in the program that could benefit from this.**/

        String looper;
        do {

            while (!input.hasNextInt()) {
                System.out.println("Please enter 1 or 2");
                input.nextLine();
            }
            System.out.println("Please enter 1 or 2");
            looper = input.nextLine();
            System.out.println(looper);

        } while (!Objects.equals(looper, "1") || !Objects.equals(looper, "2"));

    }
}
