package com.example.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Callback02Controller {

    @GetMapping("/callback02")
    public String login() {
        return "假装有一个页面";
    }

}
