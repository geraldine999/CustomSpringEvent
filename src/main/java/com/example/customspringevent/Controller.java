package com.example.customspringevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final EventPublisher eventPublisher;

    @Autowired
    public Controller(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("publish-event")
    public void publishEvent(){
        eventPublisher.publishCustomEvent("----Message----");
    }
}
