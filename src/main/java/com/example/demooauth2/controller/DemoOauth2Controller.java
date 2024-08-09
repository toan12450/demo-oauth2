package com.example.demooauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoOauth2Controller {
    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("pong");
    }
    @GetMapping("/user")
    public ResponseEntity<?> userInfo(@AuthenticationPrincipal OAuth2User principal) {
        return ResponseEntity.ok(principal.getAttributes());
    }

}
