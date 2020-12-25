package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.ServiceRepository;
import com.example.TravelAgencyServer.model.TourService;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceService {
    private final ServiceRepository serviceRepository;

    @Autowired
    public TourServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public int addTourService(TourService tourService) {
        serviceRepository.save(tourService);
        return 1;
    }

    public List<TourService> findAllCarriers() {
        return CollectionUtils.makeList(serviceRepository.findAll());
    }


}
