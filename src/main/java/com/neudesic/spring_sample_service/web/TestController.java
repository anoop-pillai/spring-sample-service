package com.neudesic.spring_sample_service.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/test")
public class TestController {

    @Value("${greeting.value}")
    private String greeting;

    @GetMapping
    public ResponseEntity<String> testGet() {
        return ResponseEntity.ok(greeting+"!");
    }
}
