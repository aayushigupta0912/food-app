package com.example.demo.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

    @Id
    @Column(name = "AID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long aid;
    
    @Column(name="STREET")
    private String street;
    
    @Column(name="CITY")
    private String city;
    
    @Column(name="COUNTRY")
    private String country;

    @OneToMany(targetEntity = User.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<User> user;
    
    public Set<User> getUser() {
      return user;
    }

    public void setUser(Set<User> user) {
      this.user = user;
    }

    public long getId() {
      return aid;
    }

    public void setId(long aid) {
      this.aid = aid;
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

    @Override
    public String toString() {
      return "Address [id=" + aid + ", street=" + street + ", city=" + city + ", country=" + country
          + "]";
    }

    public Address() {     
    }

    public Address(long aid, String street, String city, String country) {      
      this.aid = aid;
      this.street = street;
      this.city = city;
      this.country = country;
    }

}
