package org.example;

import java.util.Objects;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        // Set quiz runner up to only need to run methods and respond to many if statements.

        Scanner input = new Scanner (System.in);



        while (1==1) {

            System.out.println("\nPlease select what you would like to do.\n1 - Generate and take premade test.\n2 - Create your own test.\n3 - Finish");

            while (!input.hasNextInt()) {
                System.out.println("Please enter a number 1-3");
                input.nextLine();
            }
            String user = input.nextLine();

            if (Objects.equals(user, "1")) {
                if (Quiz.theTest.size() > 2) {
                    System.out.println("\nChoose the correct answer by typing the number that matches the correct answer(s)\n");
                    Quiz.getTestQuestion();
                    System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.theTest.size() + " possible points.");
                    Quiz.resetQuiz();
                } else {
                    Quiz.generateTest();
                    System.out.println("\nChoose the correct answer by typing the number that matches the correct answer(s)\n");
                    Quiz.getTestQuestion();
                    System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.theTest.size() + " possible points.");
                    Quiz.resetQuiz();
                }
            }

            if (Objects.equals(user, "2")) {
                Quiz.writeUserTest();

            }

            if (Objects.equals(user, "3")) {
                System.out.println("........\n.....\n...\n..\n.\nGoodbye");
                break;
            }



        }
    }
}
