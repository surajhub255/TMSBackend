package com.example.tms_backend.api.place;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class places extends AbstractPersistable<Long> {
    @Column(name = "PLACES TO VISIT")
    private String PLACES;
    private String PLACE;
    private double LAT;
    private double LON;
}
