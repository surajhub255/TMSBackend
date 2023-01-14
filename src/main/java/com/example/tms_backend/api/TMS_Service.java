package com.example.tms_backend.api;

import com.example.tms_backend.TMSPlacesRepo;
import com.example.tms_backend.api.hotel.hotels;
import com.example.tms_backend.api.place.places;
import com.example.tms_backend.api.request.RequestModel;
import com.example.tms_backend.api.restaurant.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TMS_Service {

    @Autowired
    private TMSHotelRepo tmsHotelRepo;
    @Autowired
    private TMSPlacesRepo tmsPlacesRepo;
    @Autowired
    private TMSRestaurantRepo tmsRestaurantRepo;
    public List<restaurant> getAllNearbyRestaurant(RequestModel requestModel) {
        return tmsRestaurantRepo.getAllByPLACE(requestModel.getPLACE());
    }

    public List<places> getAllNearbyPlaces(RequestModel requestModel) {
        return tmsPlacesRepo.getAllByPLACE(requestModel.getPLACE());
    }

    public List<hotels> getAllNearbyHotels(RequestModel requestModel) {
        return tmsHotelRepo.getAllByPLACE(requestModel.getPLACE());
    }
}
