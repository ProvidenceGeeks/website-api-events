package com.providencegeeks.service;

import com.providencegeeks.model.Event;

import java.util.List;

/**
 * Created by mdiwale on 10/26/17.
 */
public interface EventService {
  List<Event> getSortedEvents();
}
