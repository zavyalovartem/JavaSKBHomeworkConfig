package com.example.homework3.config;

import com.example.homework3.event.HomeworkEvent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("app")
@Setter
public class SimpleConfig {
    public String first_config;
    @Value("${app.second-config.subconfig}")
    public String second_config;
    @Value("${app.second-config.ttl}")
    public String third;

    @Bean
    @Profile("default")
    public HomeworkEvent firstConfig(){
        return new HomeworkEvent(this, first_config);
    }

    @Bean
    @Profile("dev")
    public HomeworkEvent secondConfig() { return new HomeworkEvent(this, second_config);}

    @Bean
    @Profile("prod")
    public HomeworkEvent third() {return new HomeworkEvent(this, third); }
}
