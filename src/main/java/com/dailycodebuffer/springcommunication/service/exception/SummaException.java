package com.dailycodebuffer.springcommunication.service.exception;

import lombok.Getter;

@Getter
public class SummaException extends RuntimeException {
    private final String message;
    public SummaException(String message) {
        super(message);
        this.message = message;
    }
}
