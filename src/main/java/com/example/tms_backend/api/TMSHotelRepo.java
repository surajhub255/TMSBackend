package com.example.tms_backend.api;

import com.example.tms_backend.api.hotel.hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMSHotelRepo extends JpaRepository<hotels, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM hotels WHERE PLACE = ?1")
    List<hotels> getAllByPLACE(String PLACE);
}
