package com.providencegeeks.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by mdiwale on 11/1/17.
 */
@Configuration
public class EventConfig {

  @Value("${event.file}")
  private String eventFileUri;

  public URI getFileUri(){
    try {
      return new URI(eventFileUri);
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
