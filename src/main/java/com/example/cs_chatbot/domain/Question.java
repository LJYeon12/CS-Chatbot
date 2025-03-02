package com.example.cs_chatbot.domain;

import com.example.cs_chatbot.domain.common.BaseEntity;
import com.example.cs_chatbot.domain.enums.CsCategory;
import com.example.cs_chatbot.domain.enums.QuestionLevel;
import com.example.cs_chatbot.domain.enums.QuestionSource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;
    @Enumerated(EnumType.STRING)
    private CsCategory csCategory;
    @Enumerated(EnumType.STRING)
    private QuestionLevel questionLevel;
    @Enumerated(EnumType.STRING)
    private QuestionSource questionSource;
}
