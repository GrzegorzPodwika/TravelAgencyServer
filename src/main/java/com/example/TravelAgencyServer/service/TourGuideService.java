package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.TourGuideRepository;
import com.example.TravelAgencyServer.model.TourGuide;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourGuideService {
    private final TourGuideRepository tourGuideRepository;

    @Autowired
    public TourGuideService(TourGuideRepository tourGuideRepository) {
        this.tourGuideRepository = tourGuideRepository;
    }

    public int addTourGuide(TourGuide tourGuide) {
        tourGuideRepository.save(tourGuide);
        return 1;
    }

    public List<TourGuide> findAllTourGuides() {
        return CollectionUtils.makeList(tourGuideRepository.findAll());
    }
}
