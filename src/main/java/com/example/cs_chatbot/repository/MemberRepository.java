package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
