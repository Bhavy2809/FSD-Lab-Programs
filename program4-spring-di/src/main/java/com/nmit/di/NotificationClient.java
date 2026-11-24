package com.nmit.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationClient {

    // Depends only on the interface, not on a concrete class
    private final MessageService messageService;

    // Constructor injection
    // (change "emailService" to "smsService" to switch the implementation)
    @Autowired
    public NotificationClient(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String to, String message) {
        messageService.sendMessage(to, message);
    }
}
