package com.example.customspringevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }
}
