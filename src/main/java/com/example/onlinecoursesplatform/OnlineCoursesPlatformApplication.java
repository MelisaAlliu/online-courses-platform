package com.example.onlinecoursesplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:63342")
public class OnlineCoursesPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineCoursesPlatformApplication.class, args);
    }
}
