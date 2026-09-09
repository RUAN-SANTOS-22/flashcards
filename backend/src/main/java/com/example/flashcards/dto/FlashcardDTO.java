package com.example.flashcards.dto;

import com.example.flashcards.entity.Flashcard;

public record FlashcardDTO(Long id, String pergunta, String resposta) {
    public FlashcardDTO(Flashcard flashcard){
        this(flashcard.getId(), flashcard.getPergunta(), flashcard.getResposta());
    }
}
