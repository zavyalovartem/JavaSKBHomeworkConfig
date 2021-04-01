package com.example.homework3.controller;

import com.example.homework3.publishers.ConfigPublisher;
import com.example.homework3.senders.SmsSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties
@ConfigurationProperties("sms")
@RequiredArgsConstructor
public class TestController {

    @Autowired
    ConfigPublisher publisher;
    @Autowired
    private final ApplicationContext context;

    @Value("${sms.phone-number}")
    private String phone_number;
    @Value("${sms.text}")
    private String text;

    @GetMapping("/testDevProd")
    public void test(){
        publisher.onEvent();
    }

    @GetMapping("/testSms")
    public void testSms(){
        SmsSender sender = context.getBean(SmsSender.class);
        sender.send(phone_number, text);
    }
}
