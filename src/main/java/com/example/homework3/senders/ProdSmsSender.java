package com.example.homework3.senders;

public class ProdSmsSender implements SmsSender{
    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("PRODSMSSENDER " + phoneNumber + " " + text);
    }
}
