package edu.eci.arsw.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.weather.services.WeatherService;

/**
 * Clase de controlador para las peticiones realizadas al servidor
 */
@RestController
public class WeatherRestController {

    @Autowired
    WeatherService weatherService;

    /**
     * Método que procesa las peticiones realizadas para obtener el clima de una ubicación
     * 
     * @param location La ubicación de la cual se desea obtener el clima
     * @return Una cadena en formato JSON con la información solicitada
     */
    @RequestMapping(value = "/get/weather/{location}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeather(@PathVariable String location) {
        try {
            return new ResponseEntity<>(weatherService.getWeatherData(location), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Ha ocurrido un error al procesar la solicitud",
                    HttpStatus.BAD_REQUEST);
        }
    }
}
