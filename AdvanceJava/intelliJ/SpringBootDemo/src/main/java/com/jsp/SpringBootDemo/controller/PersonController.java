package com.jsp.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class PersonController {
    public static void main(String[] args) {
        System.out.println("jelo");
    }
}
