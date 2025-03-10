package com.example.cs_chatbot.web.dto.MemberDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class MemberRequestDTO {

    @Getter
    @Setter
    public static class JoinDto {
        @NotBlank
        String name;
        @NotBlank
        @Email
        String email; // 이메일 필드 추가
        @NotBlank
        String password;
    }
}
