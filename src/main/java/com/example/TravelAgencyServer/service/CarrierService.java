package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.CarrierRepository;
import com.example.TravelAgencyServer.model.Carrier;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrierService {
    private final CarrierRepository carrierRepository;

    @Autowired
    public CarrierService(CarrierRepository carrierRepository) {
        this.carrierRepository = carrierRepository;
    }

    public int addCarrier(Carrier carrier) {
        carrierRepository.save(carrier);
        return 1;
    }

    public List<Carrier> findAllCarriers() {
        return CollectionUtils.makeList(carrierRepository.findAll());
    }

}
