package com.example.cs_chatbot.config.security;

import com.example.cs_chatbot.apiPayload.code.status.ErrorStatus;
import com.example.cs_chatbot.apiPayload.exception.handler.MemberHandler;
import com.example.cs_chatbot.domain.Member;
import com.example.cs_chatbot.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(username)
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
        return User
                .withUsername(member.getEmail())
                .password(member.getPassword())
                .build();
    }
}
