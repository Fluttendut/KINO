package com.mems.kinozippy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String name;
    private String bookedMovie;
    private String screen;
    private String row;
    private String seat;
    private String date;

    public Customer() {
    }

    public Customer(String name, String bookedMovie, String screen, String row, String seat, String date) {
        this.name = name;
        this.bookedMovie = bookedMovie;
        this.screen = screen;
        this.row = row;
        this.seat = seat;
        this.date = date;
    }

    public Customer(int customerId, String name, String bookedMovie, String screen, String row, String seat, String date) {
        this.customerId = customerId;
        this.name = name;
        this.bookedMovie = bookedMovie;
        this.screen = screen;
        this.row = row;
        this.seat = seat;
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookedMovie() {
        return bookedMovie;
    }

    public void setBookedMovie(String bookedMovie) {
        this.bookedMovie = bookedMovie;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", bookedMovie='" + bookedMovie + '\'' +
                ", screen='" + screen + '\'' +
                ", row='" + row + '\'' +
                ", seat='" + seat + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
