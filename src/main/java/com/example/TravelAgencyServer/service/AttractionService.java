package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.AttractionRepository;
import com.example.TravelAgencyServer.model.Attraction;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionService {
    private final AttractionRepository attractionRepository;

    @Autowired
    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public int addAttraction(Attraction attraction) {
        attractionRepository.save(attraction);
        return 1;
    }

    public List<Attraction> getAllAttractions() {
        return CollectionUtils.makeList(attractionRepository.findAll());
    }
}
