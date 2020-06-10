package com.baeldung.application.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;
    private final String mobile_No;
    
    public User() {
        this.name = "";
        this.email = "";
        this.mobile_No = "";
    }
    
    public User(String name, String email, String mobile_No) {
        this.name = name;
        this.email = email;
        this.mobile_No = mobile_No;
    }

    public String getMobile_No() { return mobile_No; }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", mobile No. =" + mobile_No + '}';
    }
}
