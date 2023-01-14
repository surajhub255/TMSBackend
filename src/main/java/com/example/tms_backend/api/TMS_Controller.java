package com.example.tms_backend.api;

import com.example.tms_backend.api.hotel.hotels;
import com.example.tms_backend.api.place.places;
import com.example.tms_backend.api.request.RequestModel;
import com.example.tms_backend.api.restaurant.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tms/api/v1/")
public class TMS_Controller {

    @Autowired
    private TMS_Service tms_service;

    @PostMapping("getRestaurant/")
    public List<restaurant> getAllNearbyRestaurant(@RequestBody RequestModel requestModel){
        return tms_service.getAllNearbyRestaurant(requestModel);
    }

    @PostMapping("getPlaces/")
    public List<places> getAllNearbyPlaces(@RequestBody RequestModel requestModel){
        return tms_service.getAllNearbyPlaces(requestModel);
    }
    @PostMapping("getHotels/")
    public List<hotels> getAllNearbyHotels (@RequestBody RequestModel requestModel){
        return tms_service.getAllNearbyHotels(requestModel);
    }

}
