package com.tbp.movie.controller;

import com.tbp.movie.model.Genre;
import com.tbp.movie.model.Movie;
import com.tbp.movie.payload.request.MovieRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JsonController {

    @GetMapping(path="getMovieJson")
    public MovieRequest returnObjectInBrowser() {
        MovieRequest someClass = new MovieRequest("name","desc","lang", Genre.valueOf("ACTION"));
       // someClass.genre();
       return someClass;
    }
}
