package com.dailycodebuffer.springcommunication.model;

import com.dailycodebuffer.springcommunication.service.validation.Invoker;
import com.dailycodebuffer.springcommunication.service.validation.NameValidation;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDto {
    private int id;
    @NameValidation(groups = {Invoker.class})
    private String name;
    private int age;
}
