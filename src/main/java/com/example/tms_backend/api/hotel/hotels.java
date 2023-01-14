package com.example.tms_backend.api.hotel;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class hotels extends AbstractPersistable<Long> {
    private String HOTELS;
    private String PLACE;
    private double LAT;
    private double LON;
}
