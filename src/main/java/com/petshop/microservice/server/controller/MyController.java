package com.petshop.microservice.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller //@RestController= the same of use @Controller + @ResponseBody on the method

public class MyController {

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Hello World";
    }


    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hello there someone of no name!";
    }


    @RequestMapping("/hi/{name}")
    public String hiThere(Map model, @PathVariable String name) {
        model.put("name", name);
        return "hi";
    }


    @RequestMapping("/help/{topic}")
    public String help(Map model, @PathVariable String topic){
        model.put("topic", topic);
        return "help";
    }

    /**
     * JSP Controller methods
     */
    @RequestMapping("/hello/{name}")
    public String hello(Map model, @PathVariable String name) {
        model.put("name", name);
        return "hello";
    }

/*
    @RequestMapping("/new")
    public String newPage() {
        return "newpage";
    }*/

}
