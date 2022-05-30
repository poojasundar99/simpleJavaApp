package com.example.simplejavaapp.entity;


import java.util.List;

public class User {

    public User(String firstName, String lastName, List<String> domains, String role, int experience) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.domain=domains;
        this.role=role;
        this.experience=experience;
    }

    private String firstName;
    private String lastName;
    private List<String> domain;
    private String role;
    private int experience;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getDomain() {
        return domain;
    }

    public String getRole() {
        return role;
    }

    public int getExperience() {
        return experience;
    }




}
