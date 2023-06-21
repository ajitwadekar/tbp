package com.tbp.movie.model;


import com.tbp.movie.payload.request.MovieRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie extends BaseModel {
    String name;
    String description;
    String lang;
    @Enumerated(EnumType.ORDINAL)
    Genre genre;

    public Movie(MovieRequest request) {
        this.name = request.movieName();
        this.description = request.movieDescription();
        this.lang = request.movieLang();
        this.genre = request.movieGenre();
    }
}
