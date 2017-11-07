package com.providencegeeks.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.config.EventConfig;
import com.providencegeeks.model.Event;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mdiwale on 11/7/17.
 */
public class EventDaoImplTest {

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Mock
  private EventConfig eventConfig;

  @Before
  public void setUp() throws Exception {

    Mockito.when(eventConfig.getFileUri())
      .then(i -> getClass().getResource("/meetups.json").toURI());
  }

  @Test
  public void getEvents() throws Exception {

    ObjectMapper objectMapper = new ObjectMapper();

    EventDaoImpl eventDaoImpl = new EventDaoImpl(objectMapper, eventConfig);
    List<Event> actualEvents = eventDaoImpl.getEvents();

    assertEquals(actualEvents.size(), 128);


  }

}