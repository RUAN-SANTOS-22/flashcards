package com.example.flashcards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.flashcards.dto.FlashcardRequestDTO;
import com.example.flashcards.dto.FlashcardResponseDTO;
import com.example.flashcards.model.Baralho;
import com.example.flashcards.model.Flashcard;
import com.example.flashcards.repository.BaralhoRepository;
import com.example.flashcards.repository.FlashcardRepository;

@RestController 
@RequestMapping ("/flashcard") //mapeando todo request que for para o endpoint flashcard 

public class FlashcardController {

    @Autowired 
    private FlashcardRepository flashcardRepository;

    @Autowired
    private BaralhoRepository baralhoRepository;

    @PostMapping
    public void saveFlashcard(@RequestBody FlashcardRequestDTO data){
        Baralho baralho = baralhoRepository.findById(data.baralhoId()).orElseThrow(() -> new RuntimeException("Baralho não encontrado"));

        Flashcard flashcardData = new Flashcard(data);
        flashcardData.setBaralho(baralho);
        flashcardRepository.save(flashcardData);
    }


    @GetMapping 
    public List<FlashcardResponseDTO> getAll(){
        List<FlashcardResponseDTO> flashcardList = flashcardRepository.findAll().stream().map(FlashcardResponseDTO::new).toList();
        return flashcardList;
    }
}
