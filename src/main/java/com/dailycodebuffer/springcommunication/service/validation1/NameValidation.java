package com.dailycodebuffer.springcommunication.service.validation1;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface NameValidation {
    String message() default "Name is required";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
