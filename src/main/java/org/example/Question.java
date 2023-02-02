package org.example;

public abstract class Question {


    private String question;
    private double pointValue;
    private static int count = 0;

    public Question (String aQuestion, double aPointValue) {
        this.question = aQuestion;
        this.pointValue = aPointValue;
    }

    public static int bump() {
        count++;
        return count;
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

}
