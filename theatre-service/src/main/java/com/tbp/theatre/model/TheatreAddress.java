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
public class TheatreAddress extends BaseModel {
    String street;
    String city;
    String state;
    String country;
    int zipCode;
}
