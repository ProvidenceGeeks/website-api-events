package com.providencegeeks.service;

import com.providencegeeks.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mdiwale on 10/26/17.
 */
@Service
public class EventServiceImpl implements EventService {

  private EventDao eventDao;

  public EventServiceImpl(EventDao eventDao) {
    this.eventDao = eventDao;
  }

  @Override
  public List<Event> getEventsSortedByTime() {

    return eventDao.getEvents().stream().sorted((o1, o2) -> Long.compare(o1.getTime(), o2.getTime())).collect(Collectors.toList());

  }
}
