package com.tbp.movie.mappers;

import com.tbp.movie.model.Movie;
import com.tbp.movie.payload.response.MovieResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieResponseMapper {
    MovieResponseMapper INSTANCE = Mappers.getMapper(MovieResponseMapper.class);

    @Mappings({
            @Mapping(source ="name", target="movieName"),
            @Mapping(source="description", target="movieDescription"),
            @Mapping(source="lang", target="movieLanguage"),
            @Mapping(source="genre", target="movieGenre")
    })

    @InheritInverseConfiguration
    MovieResponse MovieToMovieResponse(Movie movie);
}
