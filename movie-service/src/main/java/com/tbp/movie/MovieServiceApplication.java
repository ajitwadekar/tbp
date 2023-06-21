package com.tbp.movie;

import com.tbp.movie.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MovieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }
}
