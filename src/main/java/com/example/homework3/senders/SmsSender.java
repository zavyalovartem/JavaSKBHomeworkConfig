package com.example.homework3.senders;

public interface SmsSender {

    void send(String phoneNumber, String text);
}
