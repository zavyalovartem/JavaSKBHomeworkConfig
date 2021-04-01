package com.example.homework3.listeners;


import com.example.homework3.event.HomeworkEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class HomeworkEventListener implements ApplicationListener<HomeworkEvent> {

    @Override
    public void onApplicationEvent(HomeworkEvent event) {
        System.out.println(event.getConfig());
    }
}
