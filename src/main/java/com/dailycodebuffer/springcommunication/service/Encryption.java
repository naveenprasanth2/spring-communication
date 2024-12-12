package com.dailycodebuffer.springcommunication.service;

public interface Encryption {
    EncryptionType getEncryptionType();
    String encrypt(String plainText);
}
