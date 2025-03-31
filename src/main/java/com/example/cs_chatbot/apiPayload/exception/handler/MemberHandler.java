package com.example.cs_chatbot.apiPayload.exception.handler;

import com.example.cs_chatbot.apiPayload.code.BaseErrorCode;
import com.example.cs_chatbot.apiPayload.exception.GeneralException;

public class MemberHandler extends GeneralException {
    public MemberHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}