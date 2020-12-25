package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Tour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
