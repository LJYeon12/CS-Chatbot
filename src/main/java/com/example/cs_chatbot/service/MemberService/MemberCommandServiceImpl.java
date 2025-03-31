package com.example.cs_chatbot.service.MemberService;

import com.example.cs_chatbot.apiPayload.code.status.ErrorStatus;
import com.example.cs_chatbot.apiPayload.exception.handler.MemberHandler;
import com.example.cs_chatbot.converter.MemberConverter;
import com.example.cs_chatbot.domain.Member;
import com.example.cs_chatbot.repository.MemberRepository;
import com.example.cs_chatbot.web.dto.MemberDTO.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{
    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;
/*    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDto request) {
        Member newMember = MemberConverter.toMember(request);
        newMember.encodePassword(passwordEncoder.encode(request.getPassword()));

        return memberRepository.save(newMember);
    }*/

    //    TODO : 로그인 ID 중복 검사 메서드
    public boolean checkEmailDuplicate(String email) {
        return memberRepository.existsByEmail(email);
    }
//    TODO : 회원가입 메서드
    public void join(MemberRequestDTO.JoinDto request) {
        memberRepository.save(MemberConverter.toMember(request));
    }

    //    TODO : 로그인 메서드
    public Member login(MemberRequestDTO.LoginDto request) {
        Member member = memberRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));

        if (!member.getPassword().equals(request.getPassword())) {
            return null;
        }
        return member;
    }

    //    TODO : 로그인한 Member 반환 메서드
//    -> ? 이게 왜 필요한지..?
    public Member getLoginMemberById(Long memberId) {
        if (memberId == null) return null;

        return memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
    }
}
