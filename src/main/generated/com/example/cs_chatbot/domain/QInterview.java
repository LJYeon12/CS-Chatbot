package com.example.cs_chatbot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInterview is a Querydsl query type for Interview
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterview extends EntityPathBase<Interview> {

    private static final long serialVersionUID = 243520980L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInterview interview = new QInterview("interview");

    public final com.example.cs_chatbot.domain.common.QBaseEntity _super = new com.example.cs_chatbot.domain.common.QBaseEntity(this);

    public final ListPath<Answer, QAnswer> answers = this.<Answer, QAnswer>createList("answers", Answer.class, QAnswer.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.example.cs_chatbot.domain.mapping.InterviewQuestion, com.example.cs_chatbot.domain.mapping.QInterviewQuestion> interviewQuestions = this.<com.example.cs_chatbot.domain.mapping.InterviewQuestion, com.example.cs_chatbot.domain.mapping.QInterviewQuestion>createList("interviewQuestions", com.example.cs_chatbot.domain.mapping.InterviewQuestion.class, com.example.cs_chatbot.domain.mapping.QInterviewQuestion.class, PathInits.DIRECT2);

    public final EnumPath<com.example.cs_chatbot.domain.enums.InterviewStatus> interviewStatus = createEnum("interviewStatus", com.example.cs_chatbot.domain.enums.InterviewStatus.class);

    public final QMember member;

    public final EnumPath<com.example.cs_chatbot.domain.enums.TechStack> techStack = createEnum("techStack", com.example.cs_chatbot.domain.enums.TechStack.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QInterview(String variable) {
        this(Interview.class, forVariable(variable), INITS);
    }

    public QInterview(Path<? extends Interview> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInterview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInterview(PathMetadata metadata, PathInits inits) {
        this(Interview.class, metadata, inits);
    }

    public QInterview(Class<? extends Interview> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

