package com.tbp.movie.dao;

import com.tbp.movie.model.Movie;

import java.util.List;

public interface MovieDao {
    Movie saveMovie(Movie movie);
    List<Movie> getMovies();
}
