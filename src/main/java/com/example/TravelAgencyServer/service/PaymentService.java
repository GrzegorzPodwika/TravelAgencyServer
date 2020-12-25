package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.PaymentRepository;
import com.example.TravelAgencyServer.model.Payment;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public int addPayment(Payment payment) {
        paymentRepository.save(payment);
        return 1;
    }

    public List<Payment> findAllPayments(){
        return CollectionUtils.makeList(paymentRepository.findAll());
    }
}
