package com.providencegeeks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mdiwale on 10/26/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lat")
  private long lat;

  @JsonProperty("lon")
  private long lon;

  @JsonProperty("repinned")
  private String repinned;

  @JsonProperty("address_1")
  private String address_1;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country")
  private String country;

  @JsonProperty("localized_country_name")
  private String localized_country_name;

  @JsonProperty("zip")
  private String zip;

  @JsonProperty("state")
  private String state;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getRepinned() {
    return repinned;
  }

  public void setRepinned(String repinned) {
    this.repinned = repinned;
  }

  public String getAddress_1() {
    return address_1;
  }

  public void setAddress_1(String address_1) {
    this.address_1 = address_1;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getLocalized_country_name() {
    return localized_country_name;
  }

  public void setLocalized_country_name(String localized_country_name) {
    this.localized_country_name = localized_country_name;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
