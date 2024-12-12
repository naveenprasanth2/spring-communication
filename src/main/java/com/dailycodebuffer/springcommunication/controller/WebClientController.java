package com.dailycodebuffer.springcommunication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class WebClientController {

    @Autowired
    WebClient webClient;

    @GetMapping("/with-department")
    public Mono<ResponseEntity<String>> getDepartment() {
        return webClient.get().uri("/give-department")
                .retrieve()
                .bodyToMono(String.class)
                .map(ResponseEntity::ok);
    }
}
