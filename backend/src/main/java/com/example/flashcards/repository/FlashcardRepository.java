package com.example.flashcards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.flashcards.entity.Flashcard;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {

}
