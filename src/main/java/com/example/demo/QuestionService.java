package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class QuestionService {

    public String getQuestions(){
        return "Hello World";
    }

    public void addQuestion(Question question){
        System.out.println(question);
    }
}
