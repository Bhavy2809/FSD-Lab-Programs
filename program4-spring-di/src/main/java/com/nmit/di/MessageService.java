package com.nmit.di;

// Abstraction: NotificationClient depends on this interface, not on a concrete class
public interface MessageService {
    void sendMessage(String to, String message);
}
