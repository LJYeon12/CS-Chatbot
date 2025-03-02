package com.example.cs_chatbot.apiPayload.exception.handler;

import com.example.cs_chatbot.apiPayload.code.BaseErrorCode;
import com.example.cs_chatbot.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
