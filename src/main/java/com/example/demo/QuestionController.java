package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "api/quiz/")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public String getQuestions(QuestionService questionService){
        return questionService.getQuestions();
    }

    @PostMapping
    public void addQuestion(@RequestBody Question question){
        //method from service layer
    }

}
