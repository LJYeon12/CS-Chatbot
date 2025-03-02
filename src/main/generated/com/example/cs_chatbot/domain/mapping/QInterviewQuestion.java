package com.example.cs_chatbot.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInterviewQuestion is a Querydsl query type for InterviewQuestion
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInterviewQuestion extends EntityPathBase<InterviewQuestion> {

    private static final long serialVersionUID = -793009734L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInterviewQuestion interviewQuestion = new QInterviewQuestion("interviewQuestion");

    public final com.example.cs_chatbot.domain.common.QBaseEntity _super = new com.example.cs_chatbot.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.example.cs_chatbot.domain.QInterview interview;

    public final com.example.cs_chatbot.domain.QQuestion question;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QInterviewQuestion(String variable) {
        this(InterviewQuestion.class, forVariable(variable), INITS);
    }

    public QInterviewQuestion(Path<? extends InterviewQuestion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInterviewQuestion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInterviewQuestion(PathMetadata metadata, PathInits inits) {
        this(InterviewQuestion.class, metadata, inits);
    }

    public QInterviewQuestion(Class<? extends InterviewQuestion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interview = inits.isInitialized("interview") ? new com.example.cs_chatbot.domain.QInterview(forProperty("interview"), inits.get("interview")) : null;
        this.question = inits.isInitialized("question") ? new com.example.cs_chatbot.domain.QQuestion(forProperty("question")) : null;
    }

}

