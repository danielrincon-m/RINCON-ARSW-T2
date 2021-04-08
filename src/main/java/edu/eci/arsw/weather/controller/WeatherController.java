package edu.eci.arsw.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WeatherController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/maps", method = RequestMethod.GET)
    public String maps() {
        return "maps";
    }
}
