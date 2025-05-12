package org.example.services;

import org.example.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    public List<Message> messageHistory = new ArrayList<>();

    public void storeMessage(Message message) {
        messageHistory.add(message);
        System.out.println("The sender is "+ message.getSender().getName() + " and receiver is "+message.getReceiver().getName()+ " and the content is: "+message.getContent());
    }

    public void displayMessageHistory(){
        for(Message message : messageHistory){
            System.out.println("The sender is "+ message.getSender().getName() + " and receiver is "+message.getReceiver().getName()+ " and the content is: "+message.getContent());
        }
    }
}
