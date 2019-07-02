package com.laba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello-world")
    public String getHello() {
        return restTemplate.getForObject("http://localhost:8081/hello/{name}", String.class,
                                            "World");
    }
}
