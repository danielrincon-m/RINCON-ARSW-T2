package edu.eci.arsw.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "hello";
    }

    @RequestMapping("/index")
    String index() {
        return "index";
    }
}
