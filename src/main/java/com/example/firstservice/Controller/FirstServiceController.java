package com.example.firstservice.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome First-Serivce";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info(header);
        return "Hi there, this is First-Service";
    }

    @GetMapping("/check")
    public String check(){
        return "Hi there, this is First-Service";
    }

}
