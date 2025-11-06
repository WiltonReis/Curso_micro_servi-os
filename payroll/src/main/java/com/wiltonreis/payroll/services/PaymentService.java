package com.wiltonreis.payroll.services;

import org.springframework.stereotype.Service;

import com.wiltonreis.payroll.entities.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment(Long workerId, int days){
        return new Payment("John Doe", 200.0, days);
    }
}
