package com.example.homework3.senders;

public class DevSmsSender implements SmsSender{

    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("DEVSMSSENDER " + phoneNumber + " " + text);
    }
}
