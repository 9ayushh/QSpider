package com.jsp.SpringBootDemo.controller;

import com.jsp.SpringBootDemo.entity.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class PersonController {
    @GetMapping("/test")
    public String test() {
        return "login Successful";
    }

    @PostMapping("/pers")
    public Person pers(@RequestBody Person person) {
        System.out.println(person);
        return person;
    }


}
