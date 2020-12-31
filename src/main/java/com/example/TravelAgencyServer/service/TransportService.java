package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.TransportRepository;
import com.example.TravelAgencyServer.model.Transport;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportService implements Dao<Transport> {
    private final TransportRepository transportRepository;

    @Autowired
    public TransportService(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @Override
    public Optional<Transport> get(Integer id) {
        return transportRepository.findById(id);
    }

    @Override
    public List<Transport> getAll() {
        return CollectionUtils.makeList(transportRepository.findAll());
    }

    @Override
    public int save(Transport transport) {
        transportRepository.save(transport);
        return 1;
    }

    @Override
    public Transport update(Transport transport) {
        return transportRepository.save(transport);
    }

    @Override
    public void delete(Transport transport) {
        transportRepository.delete(transport);
    }
}
