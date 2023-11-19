package com.cbfacademy.apiassessment.model;

import java.util.ArrayList;

public class QuizAttempt {


    private ArrayList<Flashcard> incorrectFlashcards;
    private int attemptNumber = 0;

    public QuizAttempt(ArrayList<Flashcard> incorrectFlashcards) {
        this.incorrectFlashcards = incorrectFlashcards;
        this.attemptNumber += 1;
    }

    public int getAttemptNumber() {
        return this.attemptNumber;
    }

    public ArrayList<Flashcard> getIncorrectFlashcards() {
        return this.incorrectFlashcards;
    }

    public void setIncorrectFlashcards(ArrayList<Flashcard> incorrectFlashcards) {
        this.incorrectFlashcards = incorrectFlashcards;
    }

    public void addIncorrectFlashcard(Flashcard flashcard) {
        //search if the flashcard is already present?
        this.incorrectFlashcards.add((flashcard));
    }
}
