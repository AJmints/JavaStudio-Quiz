package org.example;

import java.util.ArrayList;

public abstract class Question {


    private String question;
    private double pointValue;
    private static int count = 0;


    public Question() {
    }

    public Question (String aQuestion, double aPointValue) {
        this.question = aQuestion;
        this.pointValue = aPointValue;
    }

    public static int bump() {
        count++;
        return count;
    }

    public int ompf() {
        return count = 0;
    }
    public String getQuestion() {
        return question + "\n";
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double getPointValue() {
        return pointValue;
    }

    public void setPointValue(double pointValue) {
        this.pointValue = pointValue;
    }



    public abstract boolean calculateAnswer(int response);




    public void howManyAnswers(int val) {
        //howManyAnswers for checkbox style questions, might not be needed here.
    }

    public void runTest() {
        //run theTest, for loop of the arr.
    }
}
