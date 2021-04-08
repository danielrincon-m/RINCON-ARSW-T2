package edu.eci.arsw.weather.external;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Clase para obtener datos del clima de una ubicación desde la API de OpenWeather
 */
@Component
public class OpenWeather {

    private final String API_KEY = "MTQ0NDhhNDRjOGQwY2EzZjYyNDQwMDlhMWI5ZWVlNDk=";

    /**
     * Método que obtiene los datos del clima desde la API de OpenWeather
     * 
     * @param location La ubicación de la cuál se desean obtener los datos
     * @return La respuesta brindada por la API de OpenWeather
     * @throws IOException Cuando la petición no se logró realizar de manera satisfactoria
     */
    public String getWeatherData(String location) throws IOException {
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s",
                location, new String(Base64.getDecoder().decode(API_KEY)));
        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader in =
                new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return new JSONObject(response.toString()).toString();
    }
}
