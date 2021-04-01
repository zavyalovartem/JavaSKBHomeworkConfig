package com.example.homework3.publishers;

import com.example.homework3.config.SimpleConfig;
import com.example.homework3.event.HomeworkEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ConfigPublisher {

    @Autowired
    private ApplicationEventPublisher publisher;
    @Autowired
    private HomeworkEvent event;
    @Autowired
    private ApplicationContext context;

    public void onEvent(){
        this.event = context.getBean(HomeworkEvent.class);
        publisher.publishEvent(event);
    }
}
