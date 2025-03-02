package com.example.cs_chatbot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Qhistory is a Querydsl query type for history
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Qhistory extends EntityPathBase<History> {

    private static final long serialVersionUID = -1055307321L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final Qhistory history = new Qhistory("history");

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

    public Qhistory(String variable) {
        this(History.class, forVariable(variable), INITS);
    }

    public Qhistory(Path<? extends History> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public Qhistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public Qhistory(PathMetadata metadata, PathInits inits) {
        this(History.class, metadata, inits);
    }

    public Qhistory(Class<? extends History> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interview = inits.isInitialized("interview") ? new QInterview(forProperty("interview"), inits.get("interview")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

