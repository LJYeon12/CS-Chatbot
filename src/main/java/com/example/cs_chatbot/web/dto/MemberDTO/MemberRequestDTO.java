package com.example.cs_chatbot.web.dto.MemberDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

public class MemberRequestDTO {

    @Getter
    @Setter
    public static class JoinDto { // 회원 가입 시 받는 폼
        @NotBlank(message = "이름을 입력하세요.")
        String name;
        @NotBlank(message = "이메일을 입력하세요.")
        @Email(message = "올바른 이메일 형식이어야 합니다.")
        @Pattern(regexp = "^[^\\s]+@[^\\s]+\\.[^\\s]+$",
                message = "이메일에 공백이 포함될 수 없습니다")
        String email; // 이메일 필드 추가
        @NotBlank(message = "비밀번호를 입력하세요")
        String password;
        String passwordCheck;
    }

    @Getter
    public static class LoginDto {
        @Email(message = "올바른 이메일 형식이어야 합니다")
        String email;
        @NotBlank(message = "비밀번호는 필수 입력값입니다")
        String password;
    }


}
