package com.tbp.theatre.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seat extends BaseModel {
    String seatNumber;
    SeatType seatType;
    SeatStatus seatStatus;
    double cost;
}
