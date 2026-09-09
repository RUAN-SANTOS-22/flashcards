package com.example.flashcards.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("flashcard") //mapeando todo request que for para o endpoint flashcard 

public class FlashcardController {

    @GetMapping 
    public void getAll(){
        
    }
}
