package com.example.cs_chatbot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuestion is a Querydsl query type for Question
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestion extends EntityPathBase<Question> {

    private static final long serialVersionUID = 1873797427L;

    public static final QQuestion question = new QQuestion("question");

    public final com.example.cs_chatbot.domain.common.QBaseEntity _super = new com.example.cs_chatbot.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.example.cs_chatbot.domain.enums.CsCategory> csCategory = createEnum("csCategory", com.example.cs_chatbot.domain.enums.CsCategory.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.example.cs_chatbot.domain.enums.QuestionLevel> questionLevel = createEnum("questionLevel", com.example.cs_chatbot.domain.enums.QuestionLevel.class);

    public final EnumPath<com.example.cs_chatbot.domain.enums.QuestionSource> questionSource = createEnum("questionSource", com.example.cs_chatbot.domain.enums.QuestionSource.class);

    public final StringPath questionText = createString("questionText");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QQuestion(String variable) {
        super(Question.class, forVariable(variable));
    }

    public QQuestion(Path<? extends Question> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuestion(PathMetadata metadata) {
        super(Question.class, metadata);
    }

}

