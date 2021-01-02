package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Reservation;
import com.example.TravelAgencyServer.model.Tour;
import com.example.TravelAgencyServer.model.User;
import com.example.TravelAgencyServer.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReservationController implements Dao<Reservation>{
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @Override
    @GetMapping("/getReservation")
    public @ResponseBody
    Optional<Reservation> get(@RequestBody Integer id) {
        return reservationService.get(id);
    }

    @Override
    @GetMapping("/getAllReservations")
    public @ResponseBody
    List<Reservation> getAll() {
        return reservationService.getAll();
    }


    @PostMapping("/getAllReservationsByUser")
    public @ResponseBody
    List<Reservation> getAllByUser(@RequestBody User user) {
        return reservationService.getAllByUser(user);
    }

    @PostMapping("/getAllReservationsByTour")
    public @ResponseBody
    List<Reservation> getAllByTour(@RequestBody Tour tour) {
        return reservationService.getAllByTour(tour);
    }

    @Override
    @PostMapping("/saveReservation")
    public @ResponseBody
    int save(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    @Override
    @PostMapping("/updateReservation")
    public @ResponseBody
    Reservation update(@RequestBody Reservation reservation) {
        return reservationService.update(reservation);
    }

    @Override
    @PostMapping("/deleteReservation")
    public void delete(@RequestBody Reservation reservation) {
        System.out.println(reservation);
        reservationService.delete(reservation);
    }
}
