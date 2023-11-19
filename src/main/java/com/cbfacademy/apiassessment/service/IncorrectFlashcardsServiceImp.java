package com.cbfacademy.apiassessment.service;

import com.cbfacademy.apiassessment.repository.IncorrectFlashcardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncorrectFlashcardsServiceImp implements FlashcardService{

    @Autowired
    IncorrectFlashcardsRepository incorrectFlashcardsRepository;


}
