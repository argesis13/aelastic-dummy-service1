package com.aelastic.dummyservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DummyService1Application {

    public static void main(String[] args) {
        SpringApplication.run(DummyService1Application.class, args);
    }

}

