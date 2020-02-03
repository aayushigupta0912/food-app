package com.example.demo.dto;

import javax.persistence.Column;

public class UserAddressDTO {

  private String fname;
  private String lname;
  private String email;
  private String exp;
  private String street;
  private String city;
  private String country;

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getExp() {
    return exp;
  }

  public void setExp(String exp) {
    this.exp = exp;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
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

  public UserAddressDTO(String fname, String lname, String email, String exp, String street,
      String city, String country) {
    this.fname = fname;
    this.lname = lname;
    this.email = email;
    this.exp = exp;
    this.street = street;
    this.city = city;
    this.country = country;
  }

}
