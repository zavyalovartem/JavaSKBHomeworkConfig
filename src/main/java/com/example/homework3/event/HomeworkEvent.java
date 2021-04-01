package com.example.homework3.event;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class HomeworkEvent extends ApplicationEvent {

    private String config;

    public HomeworkEvent(Object source, String config) {
        super(source);
        this.config = config;
    }
}
