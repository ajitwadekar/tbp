package com.tbp.movie.controller;

import com.tbp.movie.payload.request.MovieRequest;
import com.tbp.movie.payload.response.MovieResponse;
import com.tbp.movie.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(path = "/movies")
    public ResponseEntity<List<MovieResponse>> getMovies() {
        return ResponseEntity.ok(movieService.getMovies());
    }

    @PostMapping(path = "/movies", consumes = "application/json", produces = "application/json")
    public ResponseEntity<MovieResponse> addMovie(@RequestBody @Valid MovieRequest movieRequest) {
        return ResponseEntity.ok(movieService.addMovie(movieRequest));
    }
}
