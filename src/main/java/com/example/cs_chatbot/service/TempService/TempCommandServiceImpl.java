package com.example.cs_chatbot.service.TempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempCommandServiceImpl implements TempCommandService{
    @Override
    public void test() {
        System.out.println("test 성공!");
    }
}
