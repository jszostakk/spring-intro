package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNameMessageService implements MessageService {
    @Bean
    public String getMessage(){
        String message = "Jakub Szostak";
        return message;
    }
}
