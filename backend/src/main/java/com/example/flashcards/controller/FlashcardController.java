package com.example.flashcards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flashcards.dto.FlashcardDTO;
import com.example.flashcards.entity.Flashcard;
import com.example.flashcards.repository.FlashcardRepository;

@RestController 
@RequestMapping ("flashcard") //mapeando todo request que for para o endpoint flashcard 

public class FlashcardController {

    @Autowired 
    private FlashcardRepository repository;

    @GetMapping 
    public List<FlashcardDTO> getAll(){
        List<FlashcardDTO> flashcardList = repository.findAll().stream().map(FlashcardDTO::new).toList();
        return flashcardList;
    }
}
