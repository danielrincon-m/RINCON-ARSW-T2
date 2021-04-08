package edu.eci.arsw.weather.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.eci.arsw.weather.external.OpenWeather;

@Component
public class WeatherService {

    @Autowired
    private OpenWeather openWeather;

    public String getWeatherData(String location) {
        try {
            return openWeather.getWeatherData(location);
        } catch (Exception e) {
            e.printStackTrace();
            return "Ha ocurrido un error en la solicitud";
        }
    }
}
