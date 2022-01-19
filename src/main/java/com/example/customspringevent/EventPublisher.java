package com.example.customspringevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {


    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        Event event = new Event(this, message);
        applicationEventPublisher.publishEvent(event);
    }
}
