package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.TourGuide;
import com.example.TravelAgencyServer.service.TourGuideService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TourGuideController implements Dao<TourGuide> {
    private final TourGuideService tourGuideService;

    public TourGuideController(TourGuideService tourGuideService) {
        this.tourGuideService = tourGuideService;
    }

    @Override
    @GetMapping(path = "/getTourGuide")
    public @ResponseBody
    Optional<TourGuide> get(@RequestBody Integer id) {
        return tourGuideService.get(id);
    }

    @Override
    @GetMapping(path = "/getAllTourGuides")
    public @ResponseBody List<TourGuide> getAll() {
        return tourGuideService.getAll();
    }

    @Override
    @PostMapping(path = "/saveTourGuide")
    public @ResponseBody
    int save(@RequestBody TourGuide tourGuide) {
        return tourGuideService.save(tourGuide);
    }

    @Override
    @PostMapping(path = "/updateTourGuide")
    public @ResponseBody
    TourGuide update(@RequestBody TourGuide tourGuide) {
        return tourGuideService.update(tourGuide);
    }

    @Override
    @PostMapping(path = "/deleteTourGuide")
    public void delete(@RequestBody TourGuide tourGuide) {
        tourGuideService.delete(tourGuide);
    }
}
