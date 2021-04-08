package edu.eci.arsw.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Weather
 */
@SpringBootApplication
public class App {

    /**
     * Método de entrada de la aplicación
     * 
     * @param args Argumentos
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
