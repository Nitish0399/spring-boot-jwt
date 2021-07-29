package com.example.security.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserSignupEventPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(String username){
        UserSignupEvent customSpringEvent = new UserSignupEvent(this, username);
        eventPublisher.publishEvent(customSpringEvent);
    }
}
