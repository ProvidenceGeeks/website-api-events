package com.providencegeeks.controller;

import com.providencegeeks.model.HealthCheck;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mdiwale on 11/9/17.
 */

@RestController
public class HealthCheckController {

  @RequestMapping(value = "/healthcheck", method = RequestMethod.GET, produces = "application/json")
  public HealthCheck healthCheck(){

    HealthCheck healthCheck = new HealthCheck();
    healthCheck.setMessage(HttpStatus.OK.getReasonPhrase());
    healthCheck.setStatus(HttpStatus.OK.value());
    return healthCheck;
  }
}
