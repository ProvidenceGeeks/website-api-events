package com.providencegeeks.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.config.EventConfig;
import com.providencegeeks.model.Event;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by mdiwale on 10/31/17.
 */
@Service
public class EventDaoImpl implements EventDao {

  private final ObjectMapper objectMapper;
  private final EventConfig eventConfig;

  public EventDaoImpl(ObjectMapper objectMapper, EventConfig eventConfig) {
    this.objectMapper = objectMapper;
    this.eventConfig = eventConfig;
  }

  @Override
  public List<Event> getEvents() {
    try {
      return objectMapper.readValue(
        eventConfig.getFileUri().toURL(),
        new TypeReference<List<Event>>(){});
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }

  }

}
