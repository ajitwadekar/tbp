package com.tbp.theatre.controller;


import com.tbp.theatre.model.*;
import com.tbp.theatre.payload.request.TheatreRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class JsonController {

    @GetMapping(path="getMovieJson")
    public TheatreRequest returnObjectInBrowser() {
        TheatreAddress theatreAddress = new TheatreAddress();
        theatreAddress.setCity("Pune");
        theatreAddress.setState("MH");
        theatreAddress.setCountry("India");
        theatreAddress.setZipCode(411061);

        List<Screen> screens = new ArrayList<>();

        // Screens
        Screen scr1 = new Screen();
        scr1.setScreenId("SCR_1");

        // Seats
        List<Seat> seats = new ArrayList<>();
        Seat seat = new Seat();
        seat.setSeatNumber("A1");
        seat.setSeatStatus(SeatStatus.AVAILABLE);
        seat.setSeatType(SeatType.NORMAL);
        seat.setCost(100);

        scr1.setSeats(seats);
        seats.add(seat);

        screens.add(scr1);

        TheatreRequest someClass = new TheatreRequest("PVR", theatreAddress, screens);
       // someClass.genre();
       return someClass;
    }
}
