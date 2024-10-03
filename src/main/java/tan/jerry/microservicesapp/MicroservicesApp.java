
/*
 * Copyright (c) 2024 YourName. All rights reserved.
 * 
 * This is a microservices architecture application demonstrating the use of Spring Boot and Spring Cloud.
 * The application uses Netflix Eureka for service discovery, Zuul for API Gateway, and Ribbon for client-side load balancing.
 */

package tan.jerry.microservicesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesApp {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesApp.class, args);
    }
}

/**
 * A REST controller to expose microservice endpoints.
 */
@RestController
class MicroserviceController {

    /**
     * Get a message from the microservice.
     * @return A welcome message.
     */
    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to the Microservice!";
    }
}
