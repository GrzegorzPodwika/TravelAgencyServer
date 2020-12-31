package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.HotelRepository;
import com.example.TravelAgencyServer.model.Hotel;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService implements Dao<Hotel> {
    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Optional<Hotel> get(Integer id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> getAll() {
        return CollectionUtils.makeList(hotelRepository.findAll());
    }

    @Override
    public int save(Hotel hotel) {
        hotelRepository.save(hotel);
        return 1;
    }

    @Override
    public Hotel update(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void delete(Hotel hotel) {
        hotelRepository.delete(hotel);
    }
}
