package com.selflearn.paymentservice.service;

import com.selflearn.paymentservice.dao.PaymentRepository;
import com.selflearn.paymentservice.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;


    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
       payment.setTransactionId(UUID.randomUUID().toString());
        return  repository.save(payment);
    }

    public String paymentProcessing(){
        //should be a third party api
        return new Random().nextBoolean()?"success":"failure";
    }
}
