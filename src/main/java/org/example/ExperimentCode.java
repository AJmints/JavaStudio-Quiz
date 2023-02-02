package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Iterator;

import static org.example.Quiz.userMadeTest;

public class ExperimentCode {

    /** This is a playground for bits of code I want to get working properly before putting them in program **/

    public static void problem() {

        Question lookerCB = new CheckBox6();
        Question lookerMC = new MultipleChoice();
        Question lookerTF = new TrueFalse();

        System.out.println("We have run Quiz.generateFalseUserTest() which can be found in Quiz class on line 864.\nBefore executing this method that contains the problem we are trying to solve, we generated a series of dummy answers to try this idea. Feel free to change the remove value in the ExperimentCode class (Line 28) to try and remove a different test item.");

        int remove = 6;
        Integer choice = 6;


        if (choice == 6) {
            for (Question item : userMadeTest) {
                if (item instanceof CheckBox6) {
                    if (((CheckBox6) item).id == remove) {
                        System.out.println("We are deep in the loop right before remove item.");
                        userMadeTest.remove(item);
                        return;
                    }
                } else if (item instanceof MultipleChoice) {
                    if (((MultipleChoice) item).id == remove) {
                        System.out.println("We are deep in the loop right before remove item.");
                        userMadeTest.remove(item);
                        return;
                    }
                } else if (item instanceof TrueFalse) {
                    if (((TrueFalse) item).id == remove) {
                        System.out.println("We are deep in the loop right before remove item.");
                        userMadeTest.remove(item);
                        return;
                    }
                }
            }
        }

        /** If you can help me solve this problem, I would be very thankful **/

    }








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
