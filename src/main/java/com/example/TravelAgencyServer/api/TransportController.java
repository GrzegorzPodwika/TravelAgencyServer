package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Transport;
import com.example.TravelAgencyServer.service.TransportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransportController implements Dao<Transport>{
    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @Override
    @GetMapping(path = "/getTransport")
    public @ResponseBody
    Optional<Transport> get(@RequestBody Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping(path = "/getAllTransports")
    public @ResponseBody
    List<Transport> getAll() {
        return transportService.getAll();
    }

    @Override
    @PostMapping(path = "/saveTransport")
    public @ResponseBody
    int save(@RequestBody Transport transport) {
        return transportService.save(transport);
    }

    @Override
    @PostMapping(path = "/updateTransport")
    public @ResponseBody
    Transport update(@RequestBody Transport transport) {
        return transportService.update(transport);
    }

    @Override
    @PostMapping(path = "/deleteTransport")
    public void delete(@RequestBody Transport transport) {
        transportService.delete(transport);
    }
}
