package org.example;

import java.util.*;

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

        System.out.println("You have left the loop.... Goodbye!\n......\n....\n...\n..\n.\n");



    }

    public static void playground2() { // Stuff in line Quiz 719

        /** Putting together a way to randomize any number of test with any number of random IDs **/
        /** Putting together a way to randomize any number of test with any number of random IDs **/
        /** Putting together a way to randomize any number of test with any number of random IDs **/
        /** Left off on line 89, We can randomize up to the highest ID num. **/

        int checkBoxCount = 0;
        ArrayList<Integer> checkBoxAnswers = new ArrayList<>();
        ArrayList<Integer> duplicateSearch = new ArrayList<>();

        Random r = new Random();
        Set<Integer>set = new LinkedHashSet<>();
        while (set.size() < userMadeTest.size()) {
            set.add(r.nextInt(userMadeTest.size()) + 1); // r.nextInt( << Here is where we add the
        }
        Integer[] arr = set.toArray(new Integer[0]);

        /** Building blocks **/

        // harvest all id nums from items in the user array
        // Put those numbers in random order in Integer[] arr

        Set<Integer>setOfValidIdNums = new LinkedHashSet<>();

        for (Question obj : userMadeTest) {
            if (obj instanceof MultipleChoice) {
                setOfValidIdNums.add(((MultipleChoice) obj).id);
            }
            if (obj instanceof CheckBox6) {
                setOfValidIdNums.add(((CheckBox6) obj).id);
            }
            if (obj instanceof TrueFalse) {
                setOfValidIdNums.add(((TrueFalse) obj).id);
            }
        }

        for (Integer item : setOfValidIdNums) {
            System.out.println(item);
        }

        Random ran = new Random();
        int upperbound = 30; //This is the highest number Random will generate and the lowest being 0.
        int rand = ran.nextInt(upperbound);

        /** Next, generate random numbers that eventually match ID and store that ID num in the Set<Integer> setOfValidIdNums in the order of random number generation **/
        System.out.println(r.nextInt(upperbound));




//        for (Integer integer : arr) {
//            for (Question obj : userMadeTest) {
//                if (obj instanceof MultipleChoice) {
//                    if (((MultipleChoice) obj).id == integer) {
//                        ((MultipleChoice) obj).getQuestionKeysMultipleChoice();
//                        int answer = input.nextInt();
//                        if (obj.calculateAnswer(answer)) {
//                            score = score + obj.getPointValue();
//                        }
//                    }
//                }
//                if (obj instanceof TrueFalse) {
//                    if (((TrueFalse) obj).id == integer) {
//                        ((TrueFalse) obj).getQuestionKeysTrueFalse();
//                        int answer = input.nextInt();
//                        if (obj.calculateAnswer(answer)) {
//                            score = score + obj.getPointValue();
//                        }
//                    }
//                }
//                if (obj instanceof CheckBox6) {
//                    if (((CheckBox6) obj).id == integer) {
//                        ((CheckBox6) obj).getQuestionKeysCheckBox6();
//
//                        while (!input.hasNextInt()) {
//                            System.out.println("Please enter a number between 1-6");
//                            input.nextLine();
//                        }
//                        int a1 = input.nextInt();
//                        duplicateSearch.add(a1);
//                        System.out.println("Next answer.");
//
//                        while (!input.hasNextInt()) {
//                            System.out.println("Please enter a number between 1-6");
//                            input.nextLine();
//                        }
//                        int a2 = input.nextInt();
//                        duplicateSearch.add(a2);
//
//                        System.out.println("Next answer.");
//
//                        while (!input.hasNextInt()) {
//                            System.out.println("Please enter a number between 1-6");
//                            input.nextLine();
//                        }
//                        int a3 = input.nextInt();
//                        duplicateSearch.add(a3);
//
//                        for (Integer item : duplicateSearch) {
//                            if (!checkBoxAnswers.contains(item)) {
//                                checkBoxAnswers.add(item);
//                            }
//                        }
//
//                        for (Integer item : checkBoxAnswers) {
//                            int i = item;
//                            if (obj.calculateAnswer(i)) {
//                                checkBoxCount++;
//                            }
//                        }
//
//                        checkBoxAnswers.clear();
//                        duplicateSearch.clear();
//                        score = score + ((CheckBox6) obj).returnScore(checkBoxCount);
//                        checkBoxCount = 0;
//
//                    }
//                }
//            }
//        }
    }
}
