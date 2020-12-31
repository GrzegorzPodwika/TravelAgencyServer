package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.TourRepository;
import com.example.TravelAgencyServer.model.Tour;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourService implements Dao<Tour> {
    private final TourRepository tourRepository;

    @Autowired
    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public Optional<Tour> get(Integer id) {
        return tourRepository.findById(id);
    }

    @Override
    public List<Tour> getAll() {
        return CollectionUtils.makeList(tourRepository.findAll());
    }

    @Override
    public int save(Tour tour) {
        tourRepository.save(tour);
        return 1;
    }

    @Override
    public Tour update(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public void delete(Tour tour) {
        tourRepository.delete(tour);
    }
}
