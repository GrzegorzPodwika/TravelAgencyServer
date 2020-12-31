package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.PaymentRepository;
import com.example.TravelAgencyServer.model.Payment;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService implements Dao<Payment> {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Optional<Payment> get(Integer id) {
        return paymentRepository.findById(id);
    }

    @Override
    public List<Payment> getAll() {
        return CollectionUtils.makeList(paymentRepository.findAll());
    }

    @Override
    public int save(Payment payment) {
        paymentRepository.save(payment);
        return 1;
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Payment payment) {
        paymentRepository.delete(payment);
    }
}
