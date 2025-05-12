package org.example;

import jakarta.annotation.PostConstruct;
import org.example.controllers.ChatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//    @Autowired
//    public SettingsService settingsService;

    @Autowired
    ChatController chatController;

//    @PostConstruct
//    public void initialize() {
//        System.out.println("Hello World!, This is my first spring boot application!🚀🚀🚀🚀");
////        System.out.println("Setting: " + settingsService.getSettings());
//    }

    @Override
    public void run(String... args) throws Exception {
        chatController.startChat();
    }
}