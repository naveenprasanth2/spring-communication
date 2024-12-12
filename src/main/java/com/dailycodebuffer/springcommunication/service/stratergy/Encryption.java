package com.dailycodebuffer.springcommunication.service.stratergy;

public interface Encryption {
    EncryptionType getEncryptionType();
    String encrypt(String plainText);
}
