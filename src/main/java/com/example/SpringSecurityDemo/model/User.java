package com.example.SpringSecurityDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;
    private String password;
    private String role;
    private String username;

    @Override
    public String  toString() {
        return "user{" +
                "id=" + id +
                ", pass='" + password + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
