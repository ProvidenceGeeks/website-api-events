package com.providencegeeks.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.providencegeeks.model.Event;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by mdiwale on 10/26/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class EventServiceImplTest {

  @Mock
  private EventDao eventDao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetEventsSortedByTime() throws Exception {

    ObjectMapper objectMapper = new ObjectMapper();

    List<Event> events = objectMapper.readValue(getClass().getResource("/meetups.json"), new TypeReference<List<Event>>(){});

    List<Event> expectedEvents = events.stream()
      .sorted((o1, o2) -> Long.compare(o1.getTime(), o2.getTime()))
      .collect(Collectors.toList());

    Mockito.when(eventDao.getEvents())
      .thenReturn(events);

    EventServiceImpl eventService = new EventServiceImpl(eventDao);

    List<Event> sortedEvents = eventService.getEventsSortedByTime();

    assertEquals(expectedEvents, sortedEvents);
  }

}