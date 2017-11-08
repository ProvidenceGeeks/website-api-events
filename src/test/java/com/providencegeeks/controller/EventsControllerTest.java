
package com.providencegeeks.controller;

import com.providencegeeks.model.Event;
import com.providencegeeks.service.EventService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by mdiwale on 11/7/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class EventsControllerTest {

  @Mock
  private EventService eventService;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetEvents() {

    List<Event> testEvents = Collections.emptyList();

    Mockito.when(eventService.getEventsSortedByTime())
      .thenReturn(testEvents);

    EventsController eventController = new EventsController(eventService);
    List<Event> events = eventController.getEvents();

     Mockito.verify(eventService).getEventsSortedByTime();

    assertEquals(testEvents, events);

  }
}



