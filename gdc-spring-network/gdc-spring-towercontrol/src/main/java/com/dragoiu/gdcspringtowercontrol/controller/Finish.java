package com.dragoiu.gdcspringtowercontrol.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Finish {

    @PostMapping("/finish")
    public String finish(@RequestBody String value) {
        System.out.println("THE FINAL RESULT IS " + value);
        return value;
    }
}
