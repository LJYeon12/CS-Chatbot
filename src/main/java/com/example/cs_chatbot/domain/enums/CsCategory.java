package com.example.cs_chatbot.domain.enums;

import lombok.Getter;

@Getter
public enum CsCategory {
    OPERATING_SYSTEM("운영체제"),
    NETWORK("네트워크"),
    ALGORITHM("알고리즘"),
    DATABASE("데이터베이스"),
    DATA_STRUCTURE("자료구조");

    private final String description;
    CsCategory(String description) {
        this.description = description;
    }
}
