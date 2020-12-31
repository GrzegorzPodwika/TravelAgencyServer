package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Attraction;
import com.example.TravelAgencyServer.service.AttractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AttractionController implements Dao<Attraction>{
    private final AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @Override
    @GetMapping("/getAttraction")
    public @ResponseBody
    Optional<Attraction> get(@RequestBody Integer id) {
        return attractionService.get(id);
    }

    @Override
    @GetMapping("/getAllAttractions")
    public @ResponseBody
    List<Attraction> getAll() {
        return attractionService.getAll();
    }

    @Override
    @PostMapping("/saveAttraction")
    public @ResponseBody
    int save(@RequestBody Attraction attraction) {
        return attractionService.save(attraction);
    }

    @Override
    @PostMapping("/updateAttraction")
    public @ResponseBody
    Attraction update(@RequestBody Attraction attraction) {
        return attractionService.update(attraction);
    }

    @Override
    @PostMapping("/deleteAttraction")
    public void delete(@RequestBody Attraction attraction) {
        attractionService.delete(attraction);
    }
}
