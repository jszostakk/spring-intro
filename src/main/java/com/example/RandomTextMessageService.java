package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component("messageService")
public class RandomTextMessageService implements MessageService{
    String[] messages = {"wiadomosc1", "wiadomosc2", "wiadomosc3", "wiadomosc4", "wiadomosc5", "wiadomosc6", "wiadomosc7", "wiadomosc8", "wiadomosc9", "wiadomosc10" };

    @Override
    public String getMessage() {
        Random rand = new Random();
        int n = rand.nextInt(10);
        return messages[n];
    }
}
