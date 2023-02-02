package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TrueFalse extends Question{

    private HashMap<String, Integer> answer1; // String "answer", Integer (1 = true or 0 = false)
    private HashMap<String, Integer> answer2;
    public int id = bump();

    public TrueFalse() {
        super("", 0);
    }

    public TrueFalse(String aQuestion, double aPointValue, HashMap<String, Integer> answer1, HashMap<String, Integer> answer2) {
        super(aQuestion, aPointValue);
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public TrueFalse(String aQuestion, double aPointValue) {
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

    public boolean calculateAnswer(int answer) {
        ArrayList<HashMap<String, Integer>> check = new ArrayList<>();
        check.add(this.answer1);
        check.add(this.answer2);

        if (answer == 0) {
            return false;
        }

        for (HashMap<String, Integer> item : check) {
            for (Map.Entry<String, Integer> contents : item.entrySet()) {
                if (contents.getValue() == answer) {
                    return true;
                }
            }
        }
        return false;
    };

    public void getQuestionKeysTrueFalse() {
        String choice1 = "";
        String choice2 = "";

        for (String key : getAnswer1().keySet()) {
            choice1 = key;
        }
        for (String key : getAnswer2().keySet()) {
            choice2 = key;
        }

        System.out.println("\n" + this.getQuestion() + "1: " + choice1 + "\n2: " + choice2 + "\n");
    }
}
