package com.example.flashcards.dto;

import com.example.flashcards.model.Baralho;

public record BaralhoResponseDTO(Long id, String nome, String descricao) {
    public BaralhoResponseDTO(Baralho baralho){
        this(baralho.getId(), baralho.getNome() , baralho.getDescricao());
    }
}
