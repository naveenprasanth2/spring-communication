package com.dailycodebuffer.springcommunication.service;

import org.springframework.stereotype.Service;

@Service
public class Sha256 implements Encryption{
    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.SHA256;
    }

    @Override
    public String encrypt(String plainText) {
        return "This is encrypted using SHA256";
    }
}
