package edu.eci.arsw.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase de controlador para renderizar las plantillas almacenadas en el servidor
 */
@Controller
public class WeatherController {

    /**
     * Plantilla del index, nos retorna la página principal del servidor
     * 
     * @return El código html renderizado de la página principal del servicio
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "index";
    }
}
