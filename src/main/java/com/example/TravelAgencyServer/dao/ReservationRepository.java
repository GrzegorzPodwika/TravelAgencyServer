package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Reservation;
import com.example.TravelAgencyServer.model.Tour;
import com.example.TravelAgencyServer.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    List<Reservation> findByUser(User user);

    List<Reservation> findByTour(Tour tour);
}
