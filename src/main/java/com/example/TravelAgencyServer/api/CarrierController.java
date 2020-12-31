package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Carrier;
import com.example.TravelAgencyServer.service.CarrierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarrierController implements Dao<Carrier>{
    private final CarrierService carrierService;

    public CarrierController(CarrierService carrierService) {
        this.carrierService = carrierService;
    }

    @Override
    @GetMapping(path = "/getCarrier")
    public @ResponseBody
    Optional<Carrier> get(@RequestBody Integer id) {
        return carrierService.get(id);
    }

    @Override
    @GetMapping(path = "/getAllCarriers")
    public @ResponseBody
    List<Carrier> getAll() {
        return carrierService.getAll();
    }

    @Override
    @PostMapping(path = "/saveCarrier")
    public @ResponseBody
    int save(@RequestBody Carrier carrier) {
        return carrierService.save(carrier);
    }

    @Override
    @PostMapping(path = "/updateCarrier")
    public @ResponseBody
    Carrier update(@RequestBody Carrier carrier) {
        return carrierService.update(carrier);
    }

    @Override
    @PostMapping("/deleteCarrier")
    public void delete(@RequestBody Carrier carrier) {
        carrierService.delete(carrier);
    }
}
