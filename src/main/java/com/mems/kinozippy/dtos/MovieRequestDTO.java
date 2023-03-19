package com.mems.kinozippy.dtos;

public class MovieRequestDTO {
    private String title;
    private String genre;
    private String length;
    private int rating;
    private String ageRestriction;

    public MovieRequestDTO(String title, String genre, String length, int rating, String ageRestriction) {
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.rating = rating;
        this.ageRestriction = ageRestriction;
    }

    public MovieRequestDTO() {
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

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
