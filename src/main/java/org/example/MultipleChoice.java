package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question{

    private HashMap<String, Integer> answer1;
    private HashMap<String, Integer> answer2;
    private HashMap<String, Integer> answer3;
    private HashMap<String, Integer> answer4;

    public int id = bump();

    public MultipleChoice() {
        super("", 0);
    }

    public MultipleChoice(String aQuestion, double aPointValue, HashMap<String, Integer> answer1, HashMap<String, Integer> answer2, HashMap<String, Integer> answer3, HashMap<String, Integer> answer4) {
        super(aQuestion, aPointValue);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public MultipleChoice(String aQuestion, double aPointValue) {
        super(aQuestion, aPointValue);
    }

    public HashMap<String, Integer> getAnswer1() {
        return answer1;
    }

    public void setAnswer1(HashMap<String, Integer> answer1) {
        this.answer1 = answer1;
    }

    public HashMap<String, Integer> getAnswer2() {
        return answer2;
    }

    public void setAnswer2(HashMap<String, Integer> answer2) {
        this.answer2 = answer2;
    }

    public HashMap<String, Integer> getAnswer3() {
        return answer3;
    }

    public void setAnswer3(HashMap<String, Integer> answer3) {
        this.answer3 = answer3;
    }

    public HashMap<String, Integer> getAnswer4() {
        return answer4;
    }

    public void setAnswer4(HashMap<String, Integer> answer4) {
        this.answer4 = answer4;
    }

    public void getQuestionKeysMultipleChoice() {
        String choice1 = "";
        String choice2 = "";
        String choice3 = "";
        String choice4 = "";

        for (String key : getAnswer1().keySet()) {
            choice1 = key;
        }
        for (String key : getAnswer2().keySet()) {
            choice2 = key;
        }
        for (String key : getAnswer3().keySet()) {
            choice3 = key;
        }
        for (String key : getAnswer4().keySet()) {
            choice4 = key;
        }

        System.out.println("\n" + this.getQuestion() + "1: " + choice1 + "\n2: " + choice2 + "\n3: " + choice3 + "\n4: " + choice4 + "\n");
    }

    public boolean calculateAnswer(int num) {
        ArrayList<HashMap<String, Integer>> check = new ArrayList<>();
        check.add(this.answer1);
        check.add(this.answer2);
        check.add(this.answer3);
        check.add(this.answer4);

        if (num == 0) {
            return false;
        }

        for (HashMap<String, Integer> item : check) {
            for (Map.Entry<String, Integer> contents : item.entrySet()) {
                if (contents.getValue() == num) {
                    return true;
                }
            }
        }
        return false;
    };

}
