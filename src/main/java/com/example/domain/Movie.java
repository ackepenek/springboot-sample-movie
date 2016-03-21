package com.example.domain;

import javax.persistence.*;
/**
 * Developed by Ahmet Can Kepenek (ahmetcan.kepenek@gmail.com)
 */
@Entity
public class Movie {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
