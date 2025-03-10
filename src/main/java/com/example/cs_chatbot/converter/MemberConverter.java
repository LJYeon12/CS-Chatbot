package com.example.cs_chatbot.converter;

import com.example.cs_chatbot.domain.Member;
import com.example.cs_chatbot.web.dto.MemberDTO.MemberRequestDTO;

public class MemberConverter {

    public static Member toMember(MemberRequestDTO.JoinDto request) {
        return Member.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }

}
