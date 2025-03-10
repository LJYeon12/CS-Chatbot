package com.example.cs_chatbot.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 851648295L;

    public static final QMember member = new QMember("member1");

    public final com.example.cs_chatbot.domain.common.QBaseEntity _super = new com.example.cs_chatbot.domain.common.QBaseEntity(this);

    public final EnumPath<com.example.cs_chatbot.domain.enums.AuthProvider> authProvider = createEnum("authProvider", com.example.cs_chatbot.domain.enums.AuthProvider.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final ListPath<History, QHistory> histories = this.<History, QHistory>createList("histories", History.class, QHistory.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Interview, QInterview> interviewList = this.<Interview, QInterview>createList("interviewList", Interview.class, QInterview.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath providerId = createString("providerId");

    public final ListPath<Recommendation, QRecommendation> recommendations = this.<Recommendation, QRecommendation>createList("recommendations", Recommendation.class, QRecommendation.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

