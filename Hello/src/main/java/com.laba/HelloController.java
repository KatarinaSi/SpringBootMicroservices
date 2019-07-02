package com.laba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello.title.prefix}")
    private String prefix;

    @Value("${hello.title.sufix}")
    private String sufix;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable(required = false) String name){
        return prefix + name + sufix;
    }
}
