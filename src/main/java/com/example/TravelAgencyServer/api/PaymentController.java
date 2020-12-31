package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Payment;
import com.example.TravelAgencyServer.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController implements Dao<Payment>{
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    @GetMapping("/getPayment")
    public @ResponseBody
    Optional<Payment> get(@RequestBody Integer id) {
        return paymentService.get(id);
    }

    @Override
    @GetMapping("/getAllPayments")
    public List<Payment> getAll() {
        return paymentService.getAll();
    }

    @Override
    @PostMapping("/savePayment")
    public @ResponseBody
    int save(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @Override
    @PostMapping("/updatePayment")
    public @ResponseBody
    Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @Override
    @PostMapping("/deletePayment")
    public void delete(@RequestBody Payment payment) {
        paymentService.delete(payment);
    }
}
