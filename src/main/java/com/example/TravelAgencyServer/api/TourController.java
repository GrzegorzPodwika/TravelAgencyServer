package com.example.TravelAgencyServer.api;


import com.example.TravelAgencyServer.model.Tour;
import com.example.TravelAgencyServer.service.TourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TourController implements Dao<Tour>{
    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @Override
    @GetMapping("/getTour")
    public @ResponseBody
    Optional<Tour> get(@RequestBody Integer id) {
        return tourService.get(id);
    }

    @Override
    @GetMapping("/getAllTours")
    public @ResponseBody
    List<Tour> getAll() {
        return tourService.getAll();
    }

    @Override
    @PostMapping(path = "/saveTour")
    public @ResponseBody
    int save(@RequestBody Tour tour) {
        System.out.println(tour);
        return tourService.save(tour);
    }

    @Override
    @PostMapping(path = "/updateTour")
    public @ResponseBody
    Tour update(@RequestBody Tour tour) {
        return tourService.update(tour);
    }

    @Override
    @PostMapping(path = "/deleteTour")
    public void delete(@RequestBody Tour tour) {
        System.out.println(tour);
        System.out.println("Przerwa");
        tourService.delete(tour);
    }
}
