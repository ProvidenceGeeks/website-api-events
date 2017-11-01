package com.providencegeeks.service;

import com.providencegeeks.model.Event;

import java.util.List;

/**
 * Created by mdiwale on 10/31/17.
 */
public interface EventDao {
  List<Event> getEvents();
}
