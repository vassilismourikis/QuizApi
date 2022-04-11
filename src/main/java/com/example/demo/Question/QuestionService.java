package com.example.demo.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    Random rand = new Random();

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }

    public List<Question> getQuestions(){
        return questionRepository.findAll();
    }

    public int addQuestion(Question question){
        //TODO: make it unique with a db
        //bound=max unique generated number
        return rand.nextInt(10000) + 1;
    }
}
