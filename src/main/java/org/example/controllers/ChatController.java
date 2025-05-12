package org.example.controllers;

import org.example.model.Message;
import org.example.model.User;
import org.example.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    User user1 = new User("Bob");
    User user2 = new User("John");

    public void startChat(){
        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("Who is sending message?(Bob/John)");
            String user = scanner.nextLine().trim();
            User receiver = user.equalsIgnoreCase("bob")? user2:user1;
            User sender = user.equalsIgnoreCase("john")? user1:user2;
            System.out.println("What is your content message to "+ (user.equalsIgnoreCase(user1.getName())? user2.getName():user1.getName()) +"?");
            String messageContent = scanner.nextLine().trim();
            Message message = new Message(sender, receiver, messageContent);
            chatService.storeMessage(message);

            System.out.println("Type 'history' to see all messages, type 'continue' to continue chatting and type 'exit' to quit. ");
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("continue")){
                continue;
            }else if (command.equalsIgnoreCase("exit")){
                break;
            }else if (command.equalsIgnoreCase("history")){
                chatService.displayMessageHistory();
            }else {
                break;
            }

        }


    }
}
