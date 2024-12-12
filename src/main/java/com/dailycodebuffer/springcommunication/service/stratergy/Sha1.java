package com.dailycodebuffer.springcommunication.service.stratergy;

import org.springframework.stereotype.Service;

@Service
public class Sha1 implements Encryption{
    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.SHA1;
    }

    @Override
    public String encrypt(String plainText) {
        return "This is encrypted using Sha1";
    }
}
