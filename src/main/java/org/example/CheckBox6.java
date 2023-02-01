package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckBox6 extends Question {

    //Thinking about making a new CheckBox4 Class that offers 4 answer. Need to figure out how to shuffle answer options.
    private HashMap<String, Integer> answer1;
    private HashMap<String, Integer> answer2;
    private HashMap<String, Integer> answer3;
    private HashMap<String, Integer> answer4;
    private HashMap<String, Integer> answer5;
    private HashMap<String, Integer> answer6;
    public int id = bump();

    public CheckBox6(String aQuestion, double aPointValue, HashMap<String, Integer> answer1, HashMap<String, Integer> answer2, HashMap<String, Integer> answer3, HashMap<String, Integer> answer4, HashMap<String, Integer> answer5, HashMap<String, Integer> answer6) {
        super(aQuestion, aPointValue);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
    }

    public CheckBox6(String aQuestion, double aPointValue) {
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

    public HashMap<String, Integer> getAnswer5() {
        return answer5;
    }

    public void setAnswer5(HashMap<String, Integer> answer5) {
        this.answer5 = answer5;
    }

    public HashMap<String, Integer> getAnswer6() {
        return answer6;
    }

    public void setAnswer6(HashMap<String, Integer> answer6) {
        this.answer6 = answer6;
    }

    public boolean calculateAnswer(int a1) {
        ArrayList<HashMap<String, Integer>> check = new ArrayList<>();
        check.add(this.answer1);
        check.add(this.answer2);
        check.add(this.answer3);
        check.add(this.answer4);
        check.add(this.answer5);
        check.add(this.answer6);

        for (HashMap<String, Integer> item : check) {
            for (Map.Entry<String, Integer> contents : item.entrySet()) {
                if (contents.getValue() == a1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void getQuestionKeysCheckBox6() {
        String choice1 = "";
        String choice2 = "";
        String choice3 = "";
        String choice4 = "";
        String choice5 = "";
        String choice6 = "";

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
        for (String key : getAnswer5().keySet()) {
                choice5 = key;
        }
        for (String key : getAnswer6().keySet()) {
                choice6 = key;
        }


        System.out.println("\n" + this.getQuestion() + "1: " + choice1 + "\n2: " + choice2 + "\n3: " + choice3 + "\n4: " + choice4 + "\n5: " + choice5 + "\n6: " + choice6 + "\n\nPlease select 3 answers, enter 0 if there are no more correct answers.\n(Select 1 option, hit enter, repeat.\n");
    }

    public double returnScore(Integer num) {
        if (num > 3) {
            return .22 * num;
        }
        if (num == 3) {
            return 1;
        }
        return .33 * num;
    }


}