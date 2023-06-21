package com.tbp.movie.dao;

import com.tbp.movie.model.Movie;
import com.tbp.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieDaoImpl implements MovieDao {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return this.movieRepository.save(movie);
    }
    @Override
    public List<Movie> getMovies() {
        return this.movieRepository.findAll();
    }
}
