package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdiwale on 10/26/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

  @JsonProperty("id")
  private String id;

  @JsonProperty("created")
  private long created;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  @JsonProperty("time")
  private long time;

  @JsonProperty("updated")
  private long updated;

  @JsonProperty("utc_offset")
  private long utc_offset;

  @JsonProperty("waitlist_count")
  private int waitlist_count;

  @JsonProperty("yes_rsvp_count")
  private int yes_rsvp_count;

  @JsonProperty("link")
  private String link;

  @JsonProperty("description")
  private String description;

  @JsonProperty("visibility")
  private String visibility;

  @JsonProperty("group")
  private Group group;

  @JsonProperty("venue")
  private Venue venue;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public long getCreated() {
    return created;
  }

  public void setCreated(long created) {
    this.created = created;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public long getUpdated() {
    return updated;
  }

  public void setUpdated(long updated) {
    this.updated = updated;
  }

  public long getUtc_offset() {
    return utc_offset;
  }

  public void setUtc_offset(long utc_offset) {
    this.utc_offset = utc_offset;
  }

  public int getWaitlist_count() {
    return waitlist_count;
  }

  public void setWaitlist_count(int waitlist_count) {
    this.waitlist_count = waitlist_count;
  }

  public int getYes_rsvp_count() {
    return yes_rsvp_count;
  }

  public void setYes_rsvp_count(int yes_rsvp_count) {
    this.yes_rsvp_count = yes_rsvp_count;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }
}
