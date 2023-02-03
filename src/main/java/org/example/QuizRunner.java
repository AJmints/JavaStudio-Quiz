package org.example;

import java.util.Objects;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        while (1==1) {

            System.out.println("\n**************************************\n\nPlease select what you would like to do.\n1 - Generate and take premade test.\n2 - Create your own test questions.\n3 - Remove question from your test.\n4 - Take the test you made.\n5 - View the current questions in your test.\n6 - Finish\n\n**************************************\n");

            while (!input.hasNextInt()) {
                System.out.println("\nPlease enter a number 1-6\n");
                input.nextLine();
            }
            String user = input.nextLine();

            if (Objects.equals(user, "1")) {
                if (Quiz.theTest.size() > 1) {
                    System.out.println("\nChoose the correct answer by typing the number that matches the correct answer(s)");
                    Quiz.getTestQuestion();
                    System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.theTest.size() + " possible points.");
                    Quiz.resetQuiz();
                } else {
                    Quiz.generateTest();
                    System.out.println("\nChoose the correct answer by typing the number that matches the correct answer(s)");
                    Quiz.getTestQuestion();
                    System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.theTest.size() + " possible points.");
                    Quiz.resetQuiz();
                }
            }

            if (Objects.equals(user, "2")) {
                Quiz.writeUserTest();
            }

            if (Objects.equals(user, "3")) {
                boolean b = true;

                do {
                    System.out.println("\nWould you like to generate a premade test to use?\n1 - yes\n2 - no\n3 - main menu");
                    while (!input.hasNextInt()) {
                        System.out.println("\nPlease enter 1 or 2.\n");
                        input.nextLine();
                    }
                    String a = input.nextLine();
                    if (Objects.equals(a, "1")) {
                        Quiz.generateFalseUserTest();
                        Quiz.removeTestQuestions();
                        b = false;
                    } else if ((Objects.equals(a, "2"))) {
                        Quiz.removeTestQuestions();
                        b = false;
                    } else if ((Objects.equals(a, "3"))) {
                        System.out.println("\nReturning to main menu.\n");
                        b = false;
                    } else {
                        System.out.println("\n.\nPlease enter a valid input.\n.\n");
                    }

                } while (b);

            }

            if (Objects.equals(user, "4")) {
                Quiz.getUserTestQuestions();
                System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.userMadeTest.size() + " possible points.");
                Quiz.resetQuiz();

            }

            if (Objects.equals(user, "5")) {
                boolean b = true;

                do {
                    System.out.println("\nWould you like to generate a premade test to use?\n1 - yes\n2 - no\n3 - main menu");
                    while (!input.hasNextInt()) {
                        System.out.println("\nPlease enter 1 or 2.\n");
                        input.nextLine();
                    }
                    String a = input.nextLine();
                    if (Objects.equals(a, "1")) {
                        Quiz.generateFalseUserTest();
                        Quiz.viewUserTestQuestions();
                        b = false;
                    } else if ((Objects.equals(a, "2"))) {
                        Quiz.viewUserTestQuestions();
                        b = false;
                    } else if ((Objects.equals(a, "3"))) {
                        System.out.println("\nReturning to main menu.\n");
                        b = false;
                    } else {
                        System.out.println("\n.\nPlease enter a valid input.\n.\n");
                    }

                } while (b);
            }

            if (Objects.equals(user, "6")) {
                System.out.println("........\n.....\n...\n..\n.\nGoodbye");
                break;
            }

            if (Objects.equals(user, "404")) {
                System.out.println("Logic not found");
                ExperimentCode.playground2();
            }

        }
    }
}
