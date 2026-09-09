package com.example.flashcards.dto;

import com.example.flashcards.model.Flashcard;

public record FlashcardResponseDTO(Long id, String pergunta, String resposta) {
    public FlashcardResponseDTO(Flashcard flashcard){
        this(flashcard.getId(), flashcard.getPergunta(), flashcard.getResposta());
    }
}
