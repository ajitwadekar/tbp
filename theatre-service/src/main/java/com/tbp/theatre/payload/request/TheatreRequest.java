package com.tbp.theatre.payload.request;

import com.tbp.theatre.model.Screen;
import com.tbp.theatre.model.TheatreAddress;

import java.util.List;

public record TheatreRequest (
        String name,
        TheatreAddress theatreAddress,
        List<Screen> screens
)
{}
