package com.example.cs_chatbot.domain.mapping;

import com.example.cs_chatbot.domain.Interview;
import com.example.cs_chatbot.domain.Question;
import com.example.cs_chatbot.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "interview_question")
public class InterviewQuestion extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interview_id") // Interview 참조 (Question에는 FK X)
    private Interview interview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id") // Question 참조
    private Question question;
}
