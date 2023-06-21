package com.tbp.theatre.mapper;

import com.tbp.theatre.model.Theatre;
import com.tbp.theatre.payload.response.TheatreResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TheatreResponseMapper {

    TheatreResponseMapper INSTANCE = Mappers.getMapper(TheatreResponseMapper.class);

    @Mappings({
            @Mapping(source ="name", target="theatreName")
    })

    @InheritInverseConfiguration
    TheatreResponse TheatreToTheatreResponse(Theatre theatre);
}
