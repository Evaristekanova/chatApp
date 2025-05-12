package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SettingsService {
    private final Map<String, String> settings = new HashMap<>();
    @PostConstruct
    public void put() {
        settings.put("username", "admin");
        settings.put("password", "admin");
        settings.put("email", "admin@example.com");

        System.out.println("Setting has been added successfully");
    }

    public Map<String, String> getSettings() {
        return settings;
    }
}
