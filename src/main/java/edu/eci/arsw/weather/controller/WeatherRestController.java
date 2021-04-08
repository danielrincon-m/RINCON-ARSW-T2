package edu.eci.arsw.weather.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {

    @RequestMapping(value = "/get/weather/{location}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeather(@PathVariable String location) {
        try {
            return new ResponseEntity<>(new String(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
