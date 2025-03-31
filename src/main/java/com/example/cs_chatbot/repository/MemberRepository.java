package com.example.cs_chatbot.repository;

import com.example.cs_chatbot.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 이메일을 갖는 객체가 존재하는 지 -> 존재하면 true 리턴 (ID 중복 검사 시 필요)
    boolean existsByEmail(String email);
    Optional<Member> findByEmail(String email);
}
