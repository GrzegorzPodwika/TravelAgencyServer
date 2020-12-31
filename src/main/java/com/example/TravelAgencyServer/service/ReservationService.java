package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.ReservationRepository;
import com.example.TravelAgencyServer.model.Reservation;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements Dao<Reservation> {
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Optional<Reservation> get(Integer id) {
        return reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> getAll() {
        return CollectionUtils.makeList(reservationRepository.findAll());
    }

    @Override
    public int save(Reservation reservation) {
        reservationRepository.save(reservation);
        return 1;
    }

    @Override
    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
