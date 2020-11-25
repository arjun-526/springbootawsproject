package net.vinayaka.anjaneya.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDemoController {

    @GetMapping("/hello")
    public String home(){
        return "Welcome to Aws first Deployment !!!!";
    }
}
