package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdiwale on 10/26/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {

  @JsonProperty("created")
  private long created;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private long id;

  @JsonProperty("join_mode")
  private String join_mode;

  @JsonProperty("lat")
  private long lat;

  @JsonProperty("lon")
  private long lon;

  @JsonProperty("urlname")
  private String urlname;

  @JsonProperty("who")
  private String who;

  @JsonProperty("localized_location")
  private String localized_location;

  @JsonProperty("region")
  private String region;

  @JsonProperty("group_photo")
  private String group_photo;

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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getJoin_mode() {
    return join_mode;
  }

  public void setJoin_mode(String join_mode) {
    this.join_mode = join_mode;
  }

  public void setGroupPhoto(String group_photo) {
    this.group_photo = group_photo;
  }

  public long getLat() {
    return lat;
  }

  public void setLat(long lat) {
    this.lat = lat;
  }

  public long getLon() {
    return lon;
  }

  public void setLon(long lon) {
    this.lon = lon;
  }

  public String getUrlname() {
    return urlname;
  }

  public void setUrlname(String urlname) {
    this.urlname = urlname;
  }

  public String getWho() {
    return who;
  }

  public void setWho(String who) {
    this.who = who;
  }

  public String getLocalized_location() {
    return localized_location;
  }

  public void setLocalized_location(String localized_location) {
    this.localized_location = localized_location;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }
  
  public void getGroupPhoto(String group_photo) {
    this.region = group_photo;
  }
}
