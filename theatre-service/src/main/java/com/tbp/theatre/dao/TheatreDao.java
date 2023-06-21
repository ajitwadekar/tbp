package com.tbp.theatre.dao;

import com.tbp.theatre.model.Theatre;

import java.util.List;

public interface TheatreDao {


    Theatre save(Theatre theatre);
    List<Theatre> get();

}
