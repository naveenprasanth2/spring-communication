package com.dailycodebuffer.springcommunication.controller;

import com.dailycodebuffer.springcommunication.service.feign.DepartmentFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private final DepartmentFeignClient departmentFeignClient;
    @Autowired
    public FeignController(DepartmentFeignClient departmentFeignClient) {
        this.departmentFeignClient = departmentFeignClient;
    }

    @GetMapping("/with-department")
    public ResponseEntity<String> getDepartment() {
        return departmentFeignClient.getDepartment();
    }
}
