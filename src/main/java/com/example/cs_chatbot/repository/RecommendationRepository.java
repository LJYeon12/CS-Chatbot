package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
