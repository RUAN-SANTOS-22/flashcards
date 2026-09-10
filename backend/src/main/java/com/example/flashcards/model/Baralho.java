package com.example.flashcards.model;

import java.util.List;

import com.example.flashcards.dto.BaralhoRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Getter 

@Entity (name = "baralhos")
@Table(name = "baralhos")
public class Baralho {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @OneToMany(mappedBy = "baralho")
    private List<Flashcard> flashcards;

    public Baralho(BaralhoRequestDTO data){
        this.nome = data.nome();
        this.descricao = data.descricao();
    }
}