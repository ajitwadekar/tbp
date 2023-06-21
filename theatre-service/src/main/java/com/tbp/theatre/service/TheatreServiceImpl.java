package com.tbp.theatre.service;

import com.tbp.theatre.dao.TheatreDao;
import com.tbp.theatre.mapper.TheatreResponseMapper;
import com.tbp.theatre.model.Theatre;
import com.tbp.theatre.payload.request.RunningShowRequest;
import com.tbp.theatre.payload.request.TheatreRequest;
import com.tbp.theatre.payload.response.TheatreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    TheatreDao theatreDao;

    @Override
    public TheatreResponse addTheatre(TheatreRequest theatreRequest) {
         return TheatreResponseMapper.INSTANCE.TheatreToTheatreResponse(theatreDao.save(new Theatre(theatreRequest)));
    }
    @Override
    public List<TheatreResponse> getTheatres() {
        List<Theatre> movies = theatreDao.get();
        return movies.stream().map(TheatreResponse::new).collect(Collectors.toList());

    }
    @Override
    public List<TheatreResponse> getRunningShow(RunningShowRequest request) {
        return null;
    }
}
