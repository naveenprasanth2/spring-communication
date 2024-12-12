package com.dailycodebuffer.springcommunication.model;

import com.dailycodebuffer.springcommunication.service.exception.NameValidation;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDto {
    private int id;
    @NameValidation
    private String name;
    private int age;
}
