package com.designpatterns.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiDesignPatterns {

    @GetMapping(path="version")
    @ResponseBody
    public Map<String,String> version(){
        Map<String, String> response = new HashMap<>();
        response.put("version","1.0");
        response.put("message","design patterns by gabrieu3");
        return response;
    }

    @GetMapping
    @ResponseBody
    public String home(){
        return "Hello Human!";
    }
}
