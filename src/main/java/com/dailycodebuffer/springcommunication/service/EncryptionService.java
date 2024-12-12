package com.dailycodebuffer.springcommunication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class EncryptionService {
    private Map<EncryptionType, Encryption> encryptionMap;

    @Autowired
    public EncryptionService(Set<Encryption> encryption) {
        setEncryptionMap(encryption);
    }

    void setEncryptionMap(Set<Encryption> encryption) {
        encryptionMap = new HashMap<>();
        encryption.forEach(encryptionType -> encryptionMap.put(encryptionType.getEncryptionType(), encryptionType));
    }

    public Encryption getEncryption(EncryptionType encryptionType) {
        return encryptionMap.get(encryptionType);
    }
}
