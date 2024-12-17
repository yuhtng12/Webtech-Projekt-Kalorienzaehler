package de.htwberlin.webtech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry
                .addMapping("/**") // Aktiviert CORS für alle Endpunkte
                .allowedMethods("*") // Erlaubt alle HTTP-Methoden (GET, POST, PUT, DELETE, etc.)
                .allowedOrigins(
                        "http://localhost:8080", // Lokale Entwicklung
                        "https://frontend-kalorienzaehler.onrender.com" // Dein deployed Frontend
                );
    }
}
