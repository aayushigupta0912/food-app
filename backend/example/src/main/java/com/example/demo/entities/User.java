package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "User_tab")
public class User {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "FIRST_NAME")
  private String fname;

  @Column(name = "LAST_NAME")
  private String lname;

  @Column(name = "PHONE")
  private String phone;

  @Column(name = "EMAIL")
  private String email;
  @Column(name = "EXPERIENCE")
  private String exp;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "aid", insertable = false, updatable = false)
  @Fetch(FetchMode.JOIN)
  private Address address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public User(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public User() {}

  @Override
  public String toString() {
    return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone
        + ", email=" + email + ", exp=" + exp + "]";
  }

  public User(long id, String fname, String lname, String phone, String email, String exp) {
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.phone = phone;
    this.email = email;
    this.exp = exp;
  }


}
