package com.dailycodebuffer.springcommunication.controller;

import com.dailycodebuffer.springcommunication.model.StudentDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation")
public class ValidationController {
    @PostMapping("/name")
    public ResponseEntity<StudentDto> validateName(@Valid @RequestBody StudentDto student) {
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
