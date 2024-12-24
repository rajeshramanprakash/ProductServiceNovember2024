package com.ecommerce.productservicenovember2024.configuration;

import com.ecommerce.productservicenovember2024.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 This is Configuration class in SpringBoot Application.
 This is annotated with @configration, indicate that this provides
 bean definitions and configuration for the application context
* */
@Configuration
public class ApplicationConfig {
    @Bean // Demotes that this method is bean producer
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
