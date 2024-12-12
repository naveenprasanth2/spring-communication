package com.dailycodebuffer.springcommunication.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "department-feign", url = "http://localhost:8081")
public interface DepartmentFeignClient {

    @GetMapping("/give-department")
    ResponseEntity<String> getDepartment();
}
