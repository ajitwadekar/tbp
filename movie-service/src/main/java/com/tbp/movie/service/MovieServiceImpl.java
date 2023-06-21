package com.tbp.movie.service;

import com.tbp.movie.dao.MovieDao;
import com.tbp.movie.mappers.MovieResponseMapper;
import com.tbp.movie.model.Movie;
import com.tbp.movie.payload.request.MovieRequest;
import com.tbp.movie.payload.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDao movieDao;

    @Override
    public MovieResponse addMovie(MovieRequest movieRequest) {
        Movie movie =  movieDao.saveMovie(new Movie(movieRequest));
        return MovieResponseMapper.INSTANCE.MovieToMovieResponse(movie);
    }

    @Override
    public List<MovieResponse> getMovies() {
        List<Movie> movies = movieDao.getMovies();
        return movies.stream().map(MovieResponse::new).collect(Collectors.toList());
    }
}
