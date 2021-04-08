package edu.eci.arsw.weather.services;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.eci.arsw.weather.cache.OpenWeatherCache;

/**
 * Clase de servicios que expone todo lo relacionado a la API del clima
 */
@Component
public class WeatherService {

    @Autowired
    private OpenWeatherCache openWeatherCache;

    /**
     * Método que obtiene información del clima de un lugar inicialmente buscando en el caché en
     * memoria
     * 
     * @param location El lugar del que se desea obtener la información
     * @return La información del clima en formato JSON
     * @throws IOException Cuando ocurre un error al obrener la información
     */
    public String getWeatherData(String location) throws IOException {
        return openWeatherCache.getWeatherData(location);
    }
}
