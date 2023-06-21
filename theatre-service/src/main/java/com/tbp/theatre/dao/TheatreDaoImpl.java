package com.tbp.theatre.dao;

import com.tbp.theatre.model.Theatre;
import com.tbp.theatre.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheatreDaoImpl implements TheatreDao {

    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public Theatre save(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
    @Override
    public List<Theatre> get() {
        return theatreRepository.findAll();
    }
}
