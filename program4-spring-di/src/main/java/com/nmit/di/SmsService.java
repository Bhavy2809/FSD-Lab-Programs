package com.nmit.di;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("SMS sent to " + to + " : " + message);
    }
}
