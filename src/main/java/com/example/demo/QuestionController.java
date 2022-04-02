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

//    curl -i -X POST -H "Content-Type: application/json" -d "{\"question\": \"QUESTION\", \"answers\": [{\"desc\": \"ANSWER1\", \"isCorrect\": true}, {\"desc\": \"ANSWER2\", \"isCorrect\": false}]}" http://localhost:8080/api/quiz/

    @PostMapping
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }
    }


