package com.dailycodebuffer.springcommunication.controller;

import com.dailycodebuffer.springcommunication.service.EncryptionService;
import com.dailycodebuffer.springcommunication.service.EncryptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {
    private final EncryptionService encryptionService;

    @Autowired
    public StrategyController(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    @PostMapping("/encrypt/message")
    public String encryptStrategy(@RequestHeader("type") EncryptionType strategy, @RequestBody String message) {
        return encryptionService.getEncryption(strategy).encrypt(message);
    }
}
