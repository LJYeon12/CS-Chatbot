package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
