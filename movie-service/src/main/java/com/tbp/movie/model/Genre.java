package com.tbp.movie.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.Entity;


public enum Genre {
    HORROR("horror"), ACTION("action"), THRILLER("thriller");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre;
    }

    public String getGenre() {
        return genre;
    }

    @JsonCreator
    public static Genre getGenreFromValue(String value) {
        for (Genre genre : Genre.values()) {
            if (genre.getGenre().equals(value)) {
                return genre;
            }
        }
        return null;
    }
}