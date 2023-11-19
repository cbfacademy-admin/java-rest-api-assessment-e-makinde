package com.cbfacademy.apiassessment.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private ArrayList<Flashcard> flashcards;
    private int currentQuestionIndex;
    private Random random;

    public Quiz(ArrayList<Flashcard> flashcards) {
        this.flashcards = new ArrayList<>(flashcards);
        this.currentQuestionIndex = 0;
        this.random = new Random();
    }

    public ArrayList<Flashcard> getIncorrectFlashcards() {

    }
}
