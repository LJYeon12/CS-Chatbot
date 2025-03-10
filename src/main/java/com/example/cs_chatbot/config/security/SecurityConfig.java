package com.example.cs_chatbot.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(request -> request
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/swagger-resources/**",
                                "/webjars/**",
                                "/",
                                "/home",
                                "/member/signup",
                                "/css/**"
                        ).permitAll()  // Swagger 관련 경로 허용
                        .anyRequest().authenticated()
                );
        http
                .formLogin((auth) -> auth
                        .loginPage("/login")
                        .defaultSuccessUrl("/home", true)
//                        .loginProcessingUrl("/loginProc")
                        .permitAll()
                );
        http
                .logout((auth) -> auth
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()
                );
        http
                .csrf((auth) -> auth.disable());
        return http.build();
    }

    // BCrypt password encoder를 리턴하는 메서드
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){

        return new BCryptPasswordEncoder();
    }
}
