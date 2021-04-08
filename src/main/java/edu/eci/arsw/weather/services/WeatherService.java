package edu.eci.arsw.weather.services;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.eci.arsw.weather.cache.OpenWeatherCache;
import edu.eci.arsw.weather.external.OpenWeather;

@Component
public class WeatherService {

    @Autowired
    private OpenWeatherCache openWeatherCache;

    public String getWeatherData(String location) throws IOException {
        return openWeatherCache.getWeatherData(location);
    }
}
