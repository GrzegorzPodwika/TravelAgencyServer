package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.AdditionalService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalServiceRepository extends CrudRepository<AdditionalService, Integer> {
}
