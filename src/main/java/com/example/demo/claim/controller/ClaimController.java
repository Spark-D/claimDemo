package com.example.demo.claim.controller;

import com.example.demo.claim.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    private final ClaimService service;

    @Autowired
    public ClaimController(ClaimService service) {
        this.service = service;
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/claim")
    public void claim() {
        service.commonClaimProcess("CANCEL");
    }
}
