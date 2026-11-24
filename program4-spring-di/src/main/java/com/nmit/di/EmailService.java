package com.nmit.di;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("Email sent to " + to + " : " + message);
    }
}
