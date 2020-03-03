package com.A1.Webflix2.models;

import javax.persistence.Entity;

@Entity
public class Actor extends APerson {
    private String character;

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

}