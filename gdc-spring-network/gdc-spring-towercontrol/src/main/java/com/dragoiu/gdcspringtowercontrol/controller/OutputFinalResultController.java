package com.dragoiu.gdcspringtowercontrol.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutputFinalResultController {

    @PostMapping(value = "/output")
    public String finish(@RequestBody String value) {
        System.out.println("THE FINAL RESULT IS " + value);
        return value;
    }

    @GetMapping(value = "/output")
    public String finishGet() {
        System.out.println("THE FINAL RESULT IS ");
        return "ceva";
    }
}
