package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.TourGuide;
import com.example.TravelAgencyServer.service.TourGuideService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TourGuideController {
    private final TourGuideService tourGuideService;

    public TourGuideController(TourGuideService tourGuideService) {
        this.tourGuideService = tourGuideService;
    }

    @PostMapping(path = "/addTourGuide")
    public @ResponseBody
    int addTourGuide(@RequestBody TourGuide tourGuide) {
        return tourGuideService.addTourGuide(tourGuide);
    }

    @GetMapping(path = "/getAllTourGuides")
    public @ResponseBody
    List<TourGuide> getAllTourGuides() {
        return tourGuideService.findAllTourGuides();
    }
}
