package org.example;

import java.util.Objects;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        while (1==1) {

            System.out.println("\nPlease select what you would like to do.\n1 - Generate and take premade test.\n2 - Create your own test questions.\n3 - Remove question from your test.\n4 - Take the test you made.\n5 - View the current questions in your test.\n6 - Finish\n");

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
                Quiz.removeTestQuestions();
            }

            if (Objects.equals(user, "4")) {
                Quiz.getUserTestQuestions();
                System.out.println("Your score was " + Quiz.getScore() + " out of " + Quiz.userMadeTest.size() + " possible points.");
                Quiz.resetQuiz();
            }

            if (Objects.equals(user, "5")) {
                /** Uncomment to interact with a premade test **/
//                Quiz.generateFalseUserTest();
                Quiz.viewUserTestQuestions();
            }

            if (Objects.equals(user, "6")) {
                System.out.println("........\n.....\n...\n..\n.\nGoodbye");
                break;
            }

            if (Objects.equals(user, "404")) {
                System.out.println("Logic not found");
            }



        }
    }
}
