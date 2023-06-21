package com.tbp.theatre.service;

import com.tbp.theatre.model.Theatre;
import com.tbp.theatre.payload.request.RunningShowRequest;
import com.tbp.theatre.payload.request.TheatreRequest;
import com.tbp.theatre.payload.response.TheatreResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TheatreService {

    TheatreResponse addTheatre(TheatreRequest theatreRequest);
    List<TheatreResponse> getTheatres();
    List<TheatreResponse> getRunningShow(RunningShowRequest request);
}
