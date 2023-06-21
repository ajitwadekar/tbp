package com.tbp.theatre.model;


import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class Screen extends BaseModel {
    String screenId;
    @OneToMany(targetEntity = Seat.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    List<Seat> seats;
}
