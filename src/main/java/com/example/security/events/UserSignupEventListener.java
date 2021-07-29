package com.example.security.events;

import com.example.security.mail.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserSignupEventListener implements ApplicationListener<UserSignupEvent> {

    @Autowired
    EmailSender emailer;

    @Override
    public void onApplicationEvent(UserSignupEvent event) {
        System.out.println("Received spring custom event - " + event.getUserEmail());

        emailer.sendEmail(event.getUserEmail(), "Thanks for signing up", "Welcome to Spring Security App");

    }
}
