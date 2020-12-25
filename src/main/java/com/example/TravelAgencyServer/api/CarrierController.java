package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Carrier;
import com.example.TravelAgencyServer.service.CarrierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarrierController {
    private final CarrierService carrierService;

    public CarrierController(CarrierService carrierService) {
        this.carrierService = carrierService;
    }

    @PostMapping(path = "/addCarrier")
    public @ResponseBody
    int addCarrier(@RequestBody Carrier carrier) {
        return carrierService.addCarrier(carrier);
    }

    @GetMapping(path = "/getAllCarriers")
    public @ResponseBody
    List<Carrier> getAllCarriers() {
        return carrierService.findAllCarriers();
    }
}
