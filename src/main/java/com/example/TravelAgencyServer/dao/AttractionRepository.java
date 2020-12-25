package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Integer> {
}
