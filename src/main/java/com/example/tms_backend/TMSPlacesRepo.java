package com.example.tms_backend;


import com.example.tms_backend.api.place.places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMSPlacesRepo extends JpaRepository<places, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM places WHERE PLACE = ?1")
    List<places> getAllByPLACE(String PLACE);
}
