package com.example.homework3.config;

import com.example.homework3.senders.DevSmsSender;
import com.example.homework3.senders.ProdSmsSender;
import com.example.homework3.senders.SmsSender;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Setter
public class SmsConfig {

    @Bean
    @Profile("default")
    public SmsSender defaultSmsSender() { return new DevSmsSender();}

    @Bean
    @Profile("dev")
    public SmsSender devSmsSender(){
        return new DevSmsSender();
    }

    @Bean
    @Profile("prod")
    public SmsSender prodSmsSender(){
        return new ProdSmsSender();
    }
}
