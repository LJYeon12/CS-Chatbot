package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
