package com.tbp.movie.payload.request;

import com.tbp.movie.model.Genre;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record MovieRequest (

        @NotBlank(message = "Movie name is invalid or missing") String movieName,
        @NotBlank(message = "Movie description is invalid or missing") String movieDescription,
        @NotBlank(message = "Movie Language is invalid or missing") String movieLang,
        Genre movieGenre
) {
}
