package com.tbp.theatre.payload.response;

import com.tbp.theatre.model.Screen;
import com.tbp.theatre.model.Theatre;
import com.tbp.theatre.model.TheatreAddress;

import java.util.List;

public record TheatreResponse (

        Long id,
        String theatreName,
        TheatreAddress theatreAddress,
        List<Screen> screens
)
{
    public TheatreResponse(Theatre theatre) {
        this(
                theatre.getId(),
                theatre.getName(),
                theatre.getTheatreAddress(),
                theatre.getScreens()
        );
    }
}
