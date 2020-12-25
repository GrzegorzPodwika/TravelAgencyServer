package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.TransportRepository;
import com.example.TravelAgencyServer.model.Transport;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {
    private final TransportRepository transportRepository;

    @Autowired
    public TransportService(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    public int addTransport(Transport transport) {
        transportRepository.save(transport);
        return 1;
    }

    public List<Transport> findAllTransports() {
        return CollectionUtils.makeList(transportRepository.findAll());
    }
}
