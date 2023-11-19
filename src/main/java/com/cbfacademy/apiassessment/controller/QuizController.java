package com.cbfacademy.apiassessment.controller;

import com.cbfacademy.apiassessment.model.Quiz;
import com.cbfacademy.apiassessment.repository.IncorrectFlashcardsRepository;
import com.cbfacademy.apiassessment.service.IncorrectFlashcardsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private IncorrectFlashcardsServiceImp incorrectFlashcardsServiceImp;


}
