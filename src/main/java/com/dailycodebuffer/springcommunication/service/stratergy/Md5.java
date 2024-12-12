package com.dailycodebuffer.springcommunication.service.stratergy;

import org.springframework.stereotype.Service;

@Service
public class Md5 implements Encryption{
    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.MD5;
    }

    @Override
    public String encrypt(String plainText) {
        return "This is encrypted using MD5";
    }
}
