package com.tbp.theatre.controller;


import com.tbp.theatre.payload.request.TheatreRequest;
import com.tbp.theatre.payload.response.TheatreResponse;
import com.tbp.theatre.service.TheatreService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @GetMapping(path = "/theatres")
    public ResponseEntity<List<TheatreResponse>> getTheatres() {
        return ResponseEntity.ok(theatreService.getTheatres());
    }

    @PostMapping(path = "/theatres", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TheatreResponse> addTheatre(@RequestBody @Valid TheatreRequest theatreRequest) {
        return ResponseEntity.ok(theatreService.addTheatre(theatreRequest));
    }
}
