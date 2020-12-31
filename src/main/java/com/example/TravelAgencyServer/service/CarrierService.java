package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.CarrierRepository;
import com.example.TravelAgencyServer.model.Carrier;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrierService implements Dao<Carrier> {
    private final CarrierRepository carrierRepository;

    @Autowired
    public CarrierService(CarrierRepository carrierRepository) {
        this.carrierRepository = carrierRepository;
    }

    @Override
    public Optional<Carrier> get(Integer id) {
        return carrierRepository.findById(id);
    }

    @Override
    public List<Carrier> getAll() {
        return CollectionUtils.makeList(carrierRepository.findAll());
    }

    @Override
    public int save(Carrier carrier) {
        carrierRepository.save(carrier);
        return 1;
    }

    @Override
    public Carrier update(Carrier carrier) {
        return carrierRepository.save(carrier);
    }

    @Override
    public void delete(Carrier carrier) {
        carrierRepository.delete(carrier);
    }
}
