package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Transport;
import com.example.TravelAgencyServer.service.TransportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportController {
    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @PostMapping(path = "/addTransport")
    public @ResponseBody
    int addTransport(@RequestBody Transport transport) {
        return transportService.addTransport(transport);
    }

    @GetMapping(path = "/getAllTransports")
    public @ResponseBody
    List<Transport> getAllTransports() {
        return transportService.findAllTransports();
    }
}
