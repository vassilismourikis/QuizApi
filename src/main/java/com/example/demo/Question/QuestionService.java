package com.example.demo.Question;

import org.springframework.stereotype.Service;
import java.util.Random;


@Service
public class QuestionService {
    Random rand = new Random();
    public String getQuestions(){
        return "Home Screen";
    }

    public int addQuestion(Question question){
        //bound=max unique generated number
        return rand.nextInt(10000) + 1;
    }
}
