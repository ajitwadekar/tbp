package com.tbp.movie.service;

import com.tbp.movie.model.Movie;
import com.tbp.movie.payload.request.MovieRequest;
import com.tbp.movie.payload.response.MovieResponse;

import java.util.List;

public interface MovieService {

     MovieResponse addMovie(MovieRequest movieRequest);
     List<MovieResponse> getMovies();
}
