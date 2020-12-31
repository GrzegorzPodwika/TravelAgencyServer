package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.AdditionalServiceRepository;
import com.example.TravelAgencyServer.model.AdditionalService;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdditionalServiceService implements Dao<AdditionalService> {
    private final AdditionalServiceRepository additionalServiceRepository;

    @Autowired
    public AdditionalServiceService(AdditionalServiceRepository additionalServiceRepository) {
        this.additionalServiceRepository = additionalServiceRepository;
    }

    @Override
    public Optional<AdditionalService> get(Integer id) {
        return additionalServiceRepository.findById(id);
    }

    @Override
    public List<AdditionalService> getAll() {
        return CollectionUtils.makeList(additionalServiceRepository.findAll());
    }

    @Override
    public int save(AdditionalService additionalService) {
        additionalServiceRepository.save(additionalService);
        return 1;
    }

    @Override
    public AdditionalService update(AdditionalService additionalService) {
        return additionalServiceRepository.save(additionalService);

    }

    @Override
    public void delete(AdditionalService additionalService) {
        additionalServiceRepository.delete(additionalService);
    }
}
