package edu.eci.arsw.weather.cache;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.eci.arsw.weather.external.OpenWeather;

/**
 * Clase de caché en memoria que guarda los registros consultados anteriormente por un periodo de 5
 * minutos para evitar sobrecargar la API
 */
@Component
public class OpenWeatherCache {

    @Autowired
    private OpenWeather openWeather;
    private final ConcurrentHashMap<String, Cache> cacheMap =
            new ConcurrentHashMap<String, Cache>();

    /**
     * Método para obtener los datos almacenados en caché si es posible
     * 
     * @param location El lugar del cual se desea obtener la información
     * @return La información almacenada en caché u obtenida de la API
     * @throws IOException Cuando ocurre algún error al obtener la aplicación
     */
    public String getWeatherData(String location) throws IOException {
        if (cacheMap.containsKey(location)) {
            Cache data = cacheMap.get(location);
            if (System.currentTimeMillis() > data.getExpirationTime()) {
                System.out.println("EXPIRED");
                cacheMap.remove(location);
            } else {
                System.out.println("CACHED");
                return data.getData();
            }
        }
        System.out.println("NEW");
        String response = openWeather.getWeatherData(location);
        long expiration = System.currentTimeMillis() + (5 * 60 * 1000);
        cacheMap.put(location, new Cache(response, expiration));
        return response;
    }
}


/**
 * Clase de datos para almacenar los resultados obtenidos de la API en caché
 */
class Cache {
    private String data;
    private long expirationTime;

    public Cache(String data, long expirationTime) {
        this.data = data;
        this.expirationTime = expirationTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
