package com.A1.Webflix2.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movie {
    
    @Id
    private int id;

    private String title;

    private int releaseYear;

    @ElementCollection
    private List<String> productionCountries;

    private String originalLanguage;

    @ElementCollection
    private List<String> genres;

    @ManyToOne
    private Director director;

    @ManyToMany
    private List<Actor> actors;

    private int length;

    @ManyToMany
    private List<ScriptWriter> scriptWriters;

    private String summary;

    private String posterLink;

    @ElementCollection
    private List<String> trailerLinks;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getProductionCountries() {
        return this.productionCountries;
    }

    public void setProductionCountries(List<String> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public String getOriginalLanguage() {
        return this.originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return this.actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<ScriptWriter> getScriptWriters() {
        return this.scriptWriters;
    }

    public void setScriptWriters(List<ScriptWriter> scriptWriters) {
        this.scriptWriters = scriptWriters;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPosterLink() {
        return this.posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public List<String> getTrailerLinks() {
        return this.trailerLinks;
    }

    public void setTrailerLinks(List<String> trailerLinks) {
        this.trailerLinks = trailerLinks;
    }

}