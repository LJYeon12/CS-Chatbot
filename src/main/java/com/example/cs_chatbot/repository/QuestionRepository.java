package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
