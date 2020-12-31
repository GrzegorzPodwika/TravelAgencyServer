package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Hotel;
import com.example.TravelAgencyServer.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HotelController implements Dao<Hotel> {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @Override
    @GetMapping("/getHotel")
    public @ResponseBody
    Optional<Hotel> get(@RequestBody Integer id) {
        return hotelService.get(id);
    }

    @Override
    @GetMapping("/getAllHotels")
    public @ResponseBody
    List<Hotel> getAll() {
        return hotelService.getAll();
    }

    @Override
    @PostMapping("/saveHotel")
    public @ResponseBody
    int save(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }

    @Override
    @PostMapping("/updateHotel")
    public @ResponseBody
    Hotel update(@RequestBody Hotel hotel) {
        return hotelService.update(hotel);
    }

    @Override
    @PostMapping("/deleteHotel")
    public void delete(@RequestBody Hotel hotel) {
        hotelService.delete(hotel);
    }
}
