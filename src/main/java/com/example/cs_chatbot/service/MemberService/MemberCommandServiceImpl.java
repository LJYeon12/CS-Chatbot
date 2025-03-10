package com.example.cs_chatbot.service.MemberService;

import com.example.cs_chatbot.converter.MemberConverter;
import com.example.cs_chatbot.domain.Member;
import com.example.cs_chatbot.repository.MemberRepository;
import com.example.cs_chatbot.web.dto.MemberDTO.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{
    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;
    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {
        Member newMember = MemberConverter.toMember(request);
        newMember.encodePassword(passwordEncoder.encode(request.getPassword()));

        return memberRepository.save(newMember);
    }
}
