package net.vinayaka.anjaneya.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDemoController {

    @RequestMapping("/getname")
    public String getName(){
        return "Welcome to Aws first Deployment Arjun !!!!";
    }
}
