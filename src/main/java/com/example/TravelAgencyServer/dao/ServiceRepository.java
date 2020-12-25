package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.TourService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<TourService, Integer> {
}
