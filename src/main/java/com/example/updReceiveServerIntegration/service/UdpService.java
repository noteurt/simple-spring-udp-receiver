package com.example.updReceiveServerIntegration.service;

import org.springframework.messaging.Message;

import java.util.Arrays;

public class UdpService {

    public void receive(byte[] message) {
        //String data = new String((byte[]) message.getPayload());
        System.out.println(Arrays.toString(message));
    }
}

