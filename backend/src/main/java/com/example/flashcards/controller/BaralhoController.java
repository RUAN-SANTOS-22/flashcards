package com.example.flashcards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flashcards.dto.BaralhoRequestDTO;
import com.example.flashcards.dto.BaralhoResponseDTO;
import com.example.flashcards.model.Baralho;
import com.example.flashcards.repository.BaralhoRepository;

@RestController 
@RequestMapping ("/baralho")

public class BaralhoController {

    @Autowired 
    private BaralhoRepository repository;


    //salvar baralho
    @PostMapping 
    public void saveBaralho(@RequestBody BaralhoRequestDTO data){
        Baralho baralhoData = new Baralho(data);
        repository.save(baralhoData);
    }
    
    //pegar todos baralhos
    @GetMapping
    public List<BaralhoResponseDTO> getAll(){
        List<BaralhoResponseDTO> baralhoList = repository.findAll().stream().map(BaralhoResponseDTO::new).toList();
        return baralhoList;
    }


}
