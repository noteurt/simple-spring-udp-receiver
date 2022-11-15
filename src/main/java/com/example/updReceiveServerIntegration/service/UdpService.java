package com.example.updReceiveServerIntegration.service;

import org.springframework.messaging.Message;

public class UdpService {

    public void receive(Message message) {
        String data = new String((byte[]) message.getPayload());
        System.out.print(data);
    }
}

