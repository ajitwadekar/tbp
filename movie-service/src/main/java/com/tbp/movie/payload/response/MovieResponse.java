package com.tbp.movie.payload.response;

import com.tbp.movie.model.Genre;
import com.tbp.movie.model.Movie;

public record MovieResponse (
    Long id,
    String movieName,
    String movieDescription,
    String movieLanguage,
    Genre movieGenre
    ) {
    public MovieResponse(Movie movie) {
        this(
                movie.getId(),
                movie.getName(),
                movie.getDescription(),
                movie.getLang(),
                movie.getGenre()
        );
    }

}
