package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.AdditionalService;
import com.example.TravelAgencyServer.service.AdditionalServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdditionalServiceController implements Dao<AdditionalService>{
    private final AdditionalServiceService additionalServiceService;

    public AdditionalServiceController(AdditionalServiceService additionalServiceService) {
        this.additionalServiceService = additionalServiceService;
    }


    @Override
    @GetMapping("/getAdditionalService")
    public @ResponseBody
    Optional<AdditionalService> get(@RequestBody Integer id) {
        return additionalServiceService.get(id);
    }

    @Override
    @GetMapping("/getAllAdditionalServices")
    public @ResponseBody
    List<AdditionalService> getAll() {
        return additionalServiceService.getAll();
    }

    @Override
    @PostMapping("/saveAdditionalService")
    public @ResponseBody
    int save(@RequestBody AdditionalService additionalService) {
        return additionalServiceService.save(additionalService);
    }

    @Override
    @PostMapping("/updateAdditionalService")
    public @ResponseBody
    AdditionalService update(@RequestBody AdditionalService additionalService) {
        return additionalServiceService.update(additionalService);
    }

    @Override
    @PostMapping("/deleteAdditionalService")
    public void delete(@RequestBody AdditionalService additionalService) {
        additionalServiceService.delete(additionalService);
    }
}
