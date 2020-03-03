package com.A1.Webflix2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inventory {
    @Id 
    private int copyNumber;

    @ManyToOne
    private Movie movie;

    public int getCopyNumber() {
        return this.copyNumber;
    }

    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}