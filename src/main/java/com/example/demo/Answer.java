package com.example.demo;

public class Answer {
    private String desc;
    private boolean isCorrect;

    public Answer(String desc, boolean isCorrect) {
        this.desc = desc;
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "desc='" + desc + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
