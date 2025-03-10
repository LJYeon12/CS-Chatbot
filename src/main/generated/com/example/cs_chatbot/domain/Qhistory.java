package com.example.cs_chatbot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHistory is a Querydsl query type for History
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHistory extends EntityPathBase<History> {

    private static final long serialVersionUID = 609345959L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHistory history = new QHistory("history");

    public final com.example.cs_chatbot.domain.common.QBaseEntity _super = new com.example.cs_chatbot.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QInterview interview;

    public final QMember member;

    public final NumberPath<Integer> score = createNumber("score", Integer.class);

    public final StringPath strengths = createString("strengths");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath weakness = createString("weakness");

    public QHistory(String variable) {
        this(History.class, forVariable(variable), INITS);
    }

    public QHistory(Path<? extends History> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHistory(PathMetadata metadata, PathInits inits) {
        this(History.class, metadata, inits);
    }

    public QHistory(Class<? extends History> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interview = inits.isInitialized("interview") ? new QInterview(forProperty("interview"), inits.get("interview")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

