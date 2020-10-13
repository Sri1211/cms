package com.example.cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value="/hi")
    public String Hello(){
        return "Hello Spring";
    }
}
