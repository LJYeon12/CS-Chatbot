package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
