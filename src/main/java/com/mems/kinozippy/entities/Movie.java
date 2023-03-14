package com.mems.kinozippy.entities;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private String genre;
    private String length;
    private int rating;
    private int ageRestriction;


    public Movie(String title) {
        this.title = title;
    }
    public Movie() {
    }

    //Not used yet
    public Movie(String title, String genre, String length, int rating, int ageRestriction) {
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.rating = rating;
        this.ageRestriction = ageRestriction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", length='" + length + '\'' +
                ", rating=" + rating +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}
