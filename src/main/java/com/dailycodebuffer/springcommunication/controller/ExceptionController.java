package com.dailycodebuffer.springcommunication.controller;

import com.dailycodebuffer.springcommunication.service.exception.SummaException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @GetMapping("/summa")
    public ResponseEntity<Object> summa() {
        throw new SummaException("bad");
    }
}
