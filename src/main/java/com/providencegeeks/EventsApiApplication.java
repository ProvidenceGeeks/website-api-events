package com.providencegeeks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.model.HealthCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventsApiApplication {

  private static HealthCheck healthCheck;


  public static void main(String[] args) {
    SpringApplication.run(EventsApiApplication.class, args);
  }

}



