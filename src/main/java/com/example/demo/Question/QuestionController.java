package com.example.demo.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    }


