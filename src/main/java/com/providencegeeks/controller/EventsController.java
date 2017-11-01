package com.providencegeeks.controller;

import com.providencegeeks.model.Event;
import com.providencegeeks.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mdiwale on 10/26/17.
 */
@RestController
public class EventsController {

  private final EventService eventService;

  @Autowired
  public EventsController(EventService eventService) {
    this.eventService = eventService;
  }

  @RequestMapping(value = "api/events", method = RequestMethod.GET)
  public List<Event> getEvents()
  {
    return eventService.getSortedEvents();

  }
}
