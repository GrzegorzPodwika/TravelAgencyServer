package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Hotel;
import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorTimesTenDatabaseImpl;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer> {
    List<Hotel> findAllByHotelId(Integer id);
}
