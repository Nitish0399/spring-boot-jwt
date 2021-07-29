package com.example.security.events;

import org.springframework.context.ApplicationEvent;

public class UserSignupEvent extends ApplicationEvent {

    private String user_email;

    public UserSignupEvent(Object source, String user_email) {
        super(source);
        this.user_email = user_email;
    }

    public String getUserEmail() {
        return user_email;
    }

    public void setUserEmail(String user_email) {
        this.user_email = user_email;
    }
}
