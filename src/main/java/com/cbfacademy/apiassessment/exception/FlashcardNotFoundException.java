package com.cbfacademy.apiassessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlashcardNotFoundException extends RuntimeException {
    public FlashcardNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return String.join(" - ", super.getMessage());
    }
}
