package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.TourGuide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourGuideRepository extends CrudRepository<TourGuide, Integer> {
}
