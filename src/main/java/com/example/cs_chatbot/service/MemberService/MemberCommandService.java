package com.example.cs_chatbot.service.MemberService;

import com.example.cs_chatbot.domain.Member;
import com.example.cs_chatbot.web.dto.MemberDTO.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
