package com.sentinelcore.secureops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureOpsController {

    @GetMapping("/status")
    public String status() {
        return "SecureOps Backend is running successfully!";
    }
}
