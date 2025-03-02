package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
