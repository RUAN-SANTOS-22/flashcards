package com.example.flashcards.model;

import java.time.LocalDateTime;

import com.example.flashcards.dto.FlashcardRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table (name = "flashcards")
@Entity (name = "flashcards")
@Getter 
@NoArgsConstructor 
@AllArgsConstructor 
@EqualsAndHashCode (of = "id")
public class Flashcard {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String pergunta;
    private String resposta;
    //private String categoria;
    private Integer dificuldade = 1;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataRevisao;
    private Integer acertos = 0;
    private Integer erros = 0;
    
    @ManyToOne @JoinColumn(name = "baralho_id", nullable = false)
    private Baralho baralho;

    public Flashcard(FlashcardRequestDTO data){
        this.pergunta = data.pergunta();
        this.resposta = data.resposta();
    }
}
