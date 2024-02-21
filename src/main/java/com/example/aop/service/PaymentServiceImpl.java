package com.example.aop.service;

import com.example.aop.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    @LogExecutionTime
    public String makePayment() {
        return "amount debited";
    }
}
