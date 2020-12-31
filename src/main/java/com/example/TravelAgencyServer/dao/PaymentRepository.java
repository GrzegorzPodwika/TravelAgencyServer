package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
