package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport, Integer> {
}
