package com.dailycodebuffer.springcommunication.controller;

import com.dailycodebuffer.springcommunication.model.StudentDto;
import com.dailycodebuffer.springcommunication.service.validation.Invoker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation")
public class ValidationController {
    @PostMapping("/name")
    public ResponseEntity<StudentDto> validateName(@Validated(value = {Invoker.class}) @RequestBody StudentDto student) {
        System.out.println(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
