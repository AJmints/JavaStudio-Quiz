package org.example;

import java.util.*;


public class Quiz {

    /**Currently working on the user making their own test. Note for tomorrow, Fix the numbering issue. Each HashMap should have the proper number reflected on it. **/
    public static ArrayList<Question> theTest = new ArrayList<>();
    public static ArrayList<Question> userMadeTest = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    private static double score;


    public static void generateTest() {

        MultipleChoice test = new MultipleChoice("What kind of organism is a tardigrade?", 1);
        MultipleChoice test2 = new MultipleChoice("What is 4 + 4?", 1);
        HashMap<String, Integer> testHash1 = new HashMap<>();
        HashMap<String, Integer> testHash2 = new HashMap<>();
        HashMap<String, Integer> testHash3 = new HashMap<>();
        HashMap<String, Integer> testHash4 = new HashMap<>();
        HashMap<String, Integer> testHash5 = new HashMap<>();
        HashMap<String, Integer> testHash6 = new HashMap<>();
        HashMap<String, Integer> testHash7 = new HashMap<>();
        HashMap<String, Integer> testHash8 = new HashMap<>();

        testHash1.put("vertebrate", 0);
        testHash2.put("nematode", 0);
        testHash3.put("invertebrate", 3);
        testHash4.put("crustacean", 0);
        test.setAnswer1(testHash1);
        test.setAnswer2(testHash2);
        test.setAnswer3(testHash3);
        test.setAnswer4(testHash4);

        testHash5.put("8", 1);
        testHash6.put("7", 0);
        testHash7.put("10", 0);
        testHash8.put("9", 0);
        test2.setAnswer1(testHash5);
        test2.setAnswer2(testHash6);
        test2.setAnswer3(testHash7);
        test2.setAnswer4(testHash8);

        Quiz.theTest.add(test);
        Quiz.theTest.add(test2);

        TrueFalse test3 = new TrueFalse("Is 5 greater than 6?", 1);
        TrueFalse test4 = new TrueFalse("Our planet is located in the Milky Way Galaxy.", 1);
        HashMap<String, Integer> testHash9 = new HashMap<>();
        HashMap<String, Integer> testHash10 = new HashMap<>();
        HashMap<String, Integer> testHash11 = new HashMap<>();
        HashMap<String, Integer> testHash12 = new HashMap<>();

        testHash9.put("Yes", 0);
        testHash10.put("No", 2);
        test3.setAnswer1(testHash9);
        test3.setAnswer2(testHash10);

        testHash11.put("Yes", 1);
        testHash12.put("No", 0);
        test4.setAnswer1(testHash11);
        test4.setAnswer2(testHash12);

        Quiz.theTest.add(test3);
        Quiz.theTest.add(test4);

        CheckBox6 test5 = new CheckBox6("Which of these are true about the Blue Whale?", 1);
        CheckBox6 test6 = new CheckBox6("Which of these are not part of a car?", 1);

        HashMap<String, Integer> testHash13 = new HashMap<>();
        HashMap<String, Integer> testHash14 = new HashMap<>();
        HashMap<String, Integer> testHash15 = new HashMap<>();
        HashMap<String, Integer> testHash16 = new HashMap<>();
        HashMap<String, Integer> testHash17 = new HashMap<>();
        HashMap<String, Integer> testHash18 = new HashMap<>();

        testHash13.put("It is the worlds largest mammal.", 1);
        testHash14.put("It has scales.", 0);
        testHash15.put("Largest land mammal.", 0);
        testHash16.put("The maximum confirmed length has been recorded at 98ft.", 4);
        testHash17.put("The US uses the Blue Whale as the symbol of freedom.", 0);
        testHash18.put("It's diet consists almost exclusively of krill", 6);
        test5.setAnswer1(testHash13);
        test5.setAnswer2(testHash14);
        test5.setAnswer3(testHash15);
        test5.setAnswer4(testHash16);
        test5.setAnswer5(testHash17);
        test5.setAnswer6(testHash18);

        HashMap<String, Integer> testHash19 = new HashMap<>();
        HashMap<String, Integer> testHash20 = new HashMap<>();
        HashMap<String, Integer> testHash21 = new HashMap<>();
        HashMap<String, Integer> testHash22 = new HashMap<>();
        HashMap<String, Integer> testHash23 = new HashMap<>();
        HashMap<String, Integer> testHash24 = new HashMap<>();

        testHash19.put("Throttle Body", 0);
        testHash20.put("Quantum Carburetor", 2);
        testHash21.put("Exhaust Manifold", 0);
        testHash22.put("SubMaster Cylinder", 4);
        testHash23.put("Drain Spark", 5);
        testHash24.put("Fuel Injectors", 0);
        test6.setAnswer1(testHash19);
        test6.setAnswer2(testHash20);
        test6.setAnswer3(testHash21);
        test6.setAnswer4(testHash22);
        test6.setAnswer5(testHash23);
        test6.setAnswer6(testHash24);

        Quiz.theTest.add(test5);
        Quiz.theTest.add(test6);

    }

    public static void writeUserTest() {
        Scanner input = new Scanner(System.in);

        //write new test in future with variable answers and questions that can be displayed shuffled/randomized
        System.out.println("\nWhat test would you like like to write?\n1 - A check box style test with a total of 6 answers provided. 3 are correct and 3 are wrong.\n2 - A True or False test.\n3 - A multiple choice style test with 4 possible answers. Only 1 can be right.");


        while (!input.hasNextInt()) {
            System.out.println("Please enter a number between 1-3");
            input.nextLine();
        }
        String answer = input.nextLine();
        if (Objects.equals(answer, "1")) {

            String cbQuestion = "";
            double cbPointValue = 1;
            HashMap<String, Integer> answer1 = new HashMap<>();
            HashMap<String, Integer> answer2 = new HashMap<>();
            HashMap<String, Integer> answer3 = new HashMap<>();
            HashMap<String, Integer> answer4 = new HashMap<>();
            HashMap<String, Integer> answer5 = new HashMap<>();
            HashMap<String, Integer> answer6 = new HashMap<>();
            String aStr1;
            Integer zInt1;
            Integer aInt1 = 0;
            String zStr1 = "false";
            String bStr1;

            System.out.println("Please enter a question:\n");
            cbQuestion = input.nextLine();

            int j = 1;
            for (int i = 0; i < 6; i++) {

                System.out.println("Your question is:\n" + cbQuestion.toUpperCase());

                System.out.println("\nPlease enter an answer to the question.\n");
                aStr1 = input.nextLine();

                System.out.println("\nIs this answer true or false?\n1 - true\n2 - false\n");
                bStr1 = input.nextLine();
                if (Objects.equals(bStr1, "1")) {
                    zStr1 = "true";
                }

                System.out.println("\nAre you sure this information is accurate?\n\nQuestion: " + cbQuestion.toUpperCase() + "?\nAnswer: '" + aStr1.toUpperCase()+ "'\nThis answer is " + zStr1.toUpperCase() + "\n\nEnter 1 for yes or 2 for no. If you select no, a void entry will be filled the question slot.");

                while (!input.hasNextInt()) {
                    System.out.println("Please enter 1 or 2");
                    input.nextLine();
                }
                bStr1 = input.nextLine();


                int lightSwitch;
                if (!zStr1.contains("true")) { // this line isn't working right.
                    lightSwitch = 0;
                } else {
                    lightSwitch = j;
                }

                zStr1 = "false";


                if (i == 0) {
                    if (Objects.equals(bStr1, "1")) {
                        answer1.put(aStr1, lightSwitch);
                        System.out.println(answer1.entrySet());
                        j++;
                    } else if (Objects.equals(bStr1, "2")) {
                        answer1.put("void", 0);
                        System.out.println(answer1.entrySet());
                        System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                        bStr1 = input.nextLine();
                        if (Objects.equals(bStr1, "1")) {
                            break;
                        }
                        j++;
                    } else {
                        answer1.put("void", 0);
                        System.out.println(answer1.entrySet());
                        System.out.println("Void entry added\n");
                        j++;
                    }
                }
                if (i == 1) {
                    if (Objects.equals(bStr1, "1")) {
                        answer2.put(aStr1, j);
                        System.out.println(answer2.entrySet());
                        j++;
                    } else if (Objects.equals(bStr1, "2")) {
                        answer2.put("void", 0);
                        System.out.println(answer2.entrySet());
                        System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                        bStr1 = input.nextLine();
                        if (Objects.equals(bStr1, "1")) {
                            break;
                        }
                        j++;
                    } else {
                        answer2.put("void", 0);
                        System.out.println(answer2.entrySet());
                        System.out.println("Void entry added\n");
                        j++;
                    }
                }
            if (i == 2) {
                if (Objects.equals(bStr1, "1")) {
                    answer3.put(aStr1, j);
                    System.out.println(answer3.entrySet());
                    j++;
                } else if (Objects.equals(bStr1, "2")) {
                    answer3.put("void", 0);
                    System.out.println(answer3.entrySet());
                    System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                    bStr1 = input.nextLine();
                    if (Objects.equals(bStr1, "1")) {
                        break;
                    }
                    j++;
                } else {
                    answer3.put("void", 0);
                    System.out.println(answer3.entrySet());
                    System.out.println("Void entry added\n");
                    j++;
                }
            }
                if (i == 3) {
                    if (Objects.equals(bStr1, "1")) {
                        answer4.put(aStr1, j);
                        System.out.println(answer4.entrySet());
                        j++;
                    } else if (Objects.equals(bStr1, "2")) {
                        answer4.put("void", 0);
                        System.out.println(answer4.entrySet());
                        System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                        bStr1 = input.nextLine();
                        if (Objects.equals(bStr1, "1")) {
                            break;
                        }
                        j++;
                    } else {
                        answer4.put("void", 0);
                        System.out.println(answer4.entrySet());
                        System.out.println("Void entry added\n");
                        j++;
                    }
                }
                if (i == 4) {
                    if (Objects.equals(bStr1, "1")) {
                        answer5.put(aStr1, j);
                        System.out.println(answer5.entrySet());
                        j++;
                    } else if (Objects.equals(bStr1, "2")) {
                        answer5.put("void", 0);
                        System.out.println(answer5.entrySet());
                        System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                        bStr1 = input.nextLine();
                        if (Objects.equals(bStr1, "1")) {
                            break;
                        }
                        j++;
                    } else {
                        answer5.put("void", 0);
                        System.out.println(answer5.entrySet());
                        System.out.println("Void entry added\n");
                        j++;
                    }
                }
                if (i == 5) {
                    if (Objects.equals(bStr1, "1")) {
                        answer6.put(aStr1, j);
                        System.out.println(answer6.entrySet());
                        j++;
                    } else if (Objects.equals(bStr1, "2")) {
                        answer6.put("void", 0);
                        System.out.println(answer6.entrySet());
                        System.out.println("Void entry added\nWould you like to terminate your progress and start over? 1 for yes, 2 for no.\n");
                        bStr1 = input.nextLine();
                        if (Objects.equals(bStr1, "1")) {
                            break;
                        }
                        j++;
                    } else {
                        answer6.put("void", 0);
                        System.out.println(answer6.entrySet());
                        System.out.println("Void entry added\n");
                        j++;
                    }
                }

            }

            CheckBox6 userQuestion = new CheckBox6(cbQuestion, cbPointValue, answer1, answer2, answer3, answer4, answer5, answer6);
            Quiz.userMadeTest.add(userQuestion);
            userQuestion.getQuestionKeysCheckBox6();

        }




    }

    public static double getScore() {
        return score;
    }

    public static double resetQuiz() {
        return score = 0;
    }
    public static void getTestQuestion() {

        int checkBoxCount = 0;
        ArrayList<Integer> checkBoxAnswers = new ArrayList<>();
        ArrayList<Integer> duplicateSearch = new ArrayList<>();
        Random r = new Random();
        Set<Integer>set = new LinkedHashSet<>();
        while (set.size() < theTest.size()) {
            set.add(r.nextInt(theTest.size()) + 1);
        }
        Integer[] arr = set.toArray(new Integer[0]);

        for (Integer integer : arr) {
            for (Question obj : theTest) {
                if (obj instanceof MultipleChoice) {
                    if (((MultipleChoice) obj).id == integer) {
                        ((MultipleChoice) obj).getQuestionKeysMultipleChoice();
                        int answer = input.nextInt();
                        if (obj.calculateAnswer(answer)) {
                            score = score + obj.getPointValue();
                        }
                    }
                }
                    if (obj instanceof TrueFalse) {
                        if (((TrueFalse) obj).id == integer) {
                            ((TrueFalse) obj).getQuestionKeysTrueFalse();
                            int answer = input.nextInt();
                            if (obj.calculateAnswer(answer)) {
                                score = score + obj.getPointValue();
                            }
                        }
                    }
                 if (obj instanceof CheckBox6) {
                     if (((CheckBox6) obj).id == integer) {
                         ((CheckBox6) obj).getQuestionKeysCheckBox6();

                         while (!input.hasNextInt()) {
                             System.out.println("Please enter a number between 1-6");
                             input.nextLine();
                         }
                         int a1 = input.nextInt();
                         duplicateSearch.add(a1);
                         System.out.println("Next answer.");

                         while (!input.hasNextInt()) {
                             System.out.println("Please enter a number between 1-6");
                             input.nextLine();
                         }
                         int a2 = input.nextInt();
                         duplicateSearch.add(a2);

                         System.out.println("Next answer.");

                         while (!input.hasNextInt()) {
                             System.out.println("Please enter a number between 1-6");
                             input.nextLine();
                         }
                         int a3 = input.nextInt();
                         duplicateSearch.add(a3);

                        for (Integer item : duplicateSearch) {
                            if (!checkBoxAnswers.contains(item)) {
                                checkBoxAnswers.add(item);
                            }
                        }

                        for (Integer item : checkBoxAnswers) {
                            int i = item;
                            if (obj.calculateAnswer(i)) {
                                checkBoxCount++;
                            }
                        }

                        checkBoxAnswers.clear();
                        duplicateSearch.clear();
                        score = score + ((CheckBox6) obj).returnScore(checkBoxCount);
                        checkBoxCount = 0;

                     }
                 }
            }
        }
    }


}
