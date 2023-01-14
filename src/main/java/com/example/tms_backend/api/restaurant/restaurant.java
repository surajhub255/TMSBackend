package com.example.tms_backend.api.restaurant;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class restaurant extends AbstractPersistable<Long> {
    private String RESTAURANT;
    private String PLACE;
    private double LAT;
    private double LON;
}
