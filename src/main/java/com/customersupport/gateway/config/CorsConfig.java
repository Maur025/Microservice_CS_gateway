package com.customersupport.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

    // @Bean
    // public CorsWebFilter corsWebFilter(Environment environment) {
    // CorsConfiguration corsConfig = new CorsConfiguration();
    // corsConfig.setAllowCredentials(true);

    // List<String> allowedOrigins =
    // Arrays.asList(environment.getProperty("allowed-urls", "").split(","));
    // corsConfig.setAllowedOrigins(allowedOrigins);
    // corsConfig.addAllowedHeader("*");
    // corsConfig.addAllowedMethod("*");

    // UrlBasedCorsConfigurationSource source = new
    // UrlBasedCorsConfigurationSource();
    // source.registerCorsConfiguration("/**", corsConfig);

    // return new CorsWebFilter(source);
    // }

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.setAllowCredentials(true);
        corsConfig.addAllowedOrigin("http://localhost:4200");
        corsConfig.addAllowedHeader("*");
        corsConfig.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);
    }
}
