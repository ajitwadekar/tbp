package com.tbp.theatre.model;

import com.tbp.theatre.payload.request.TheatreRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Theatre extends BaseModel {

    String name;

    @OneToOne(targetEntity = TheatreAddress.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    TheatreAddress theatreAddress;

    @OneToMany(targetEntity = Screen.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    List<Screen> screens;

    public Theatre(TheatreRequest request) {
        this.name = request.name();
        this.theatreAddress = request.theatreAddress();
        this.screens = request.screens();
    }
}
