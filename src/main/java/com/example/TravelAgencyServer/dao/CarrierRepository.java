package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Carrier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarrierRepository extends CrudRepository<Carrier, Integer> {
}
