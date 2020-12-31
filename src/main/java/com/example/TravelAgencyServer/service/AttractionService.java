package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.AttractionRepository;
import com.example.TravelAgencyServer.model.Attraction;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttractionService implements Dao<Attraction> {
    private final AttractionRepository attractionRepository;

    @Autowired
    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public Optional<Attraction> get(Integer id) {
        return attractionRepository.findById(id);
    }

    @Override
    public List<Attraction> getAll() {
        return CollectionUtils.makeList(attractionRepository.findAll());
    }

    @Override
    public int save(Attraction attraction) {
        attractionRepository.save(attraction);
        return 1;
    }

    @Override
    public Attraction update(Attraction attraction) {
        return attractionRepository.save(attraction);
    }

    @Override
    public void delete(Attraction attraction) {
        attractionRepository.delete(attraction);
    }
}
