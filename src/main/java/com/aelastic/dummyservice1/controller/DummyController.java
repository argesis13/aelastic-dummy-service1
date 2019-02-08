package com.aelastic.dummyservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/user")
    public String getUsers() {
        return "bla";
    }

}
