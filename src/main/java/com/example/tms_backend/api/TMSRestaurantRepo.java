package com.example.tms_backend.api;

import com.example.tms_backend.api.restaurant.restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMSRestaurantRepo extends JpaRepository<restaurant, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM restaurant WHERE PLACE = ?1")
    List<restaurant> getAllByPLACE(String PLACE);


}
