package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.TourGuideRepository;
import com.example.TravelAgencyServer.model.TourGuide;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourGuideService implements Dao<TourGuide> {
    private final TourGuideRepository tourGuideRepository;

    @Autowired
    public TourGuideService(TourGuideRepository tourGuideRepository) {
        this.tourGuideRepository = tourGuideRepository;
    }

    @Override
    public Optional<TourGuide> get(Integer id) {
        return tourGuideRepository.findById(id);
    }

    @Override
    public List<TourGuide> getAll() {
        return CollectionUtils.makeList(tourGuideRepository.findAll());
    }

    @Override
    public int save(TourGuide tourGuide) {
        tourGuideRepository.save(tourGuide);
        return 1;
    }

    @Override
    public TourGuide update(TourGuide tourGuide) {
        return tourGuideRepository.save(tourGuide);
    }

    @Override
    public void delete(TourGuide tourGuide) {
        tourGuideRepository.delete(tourGuide);
    }
}
