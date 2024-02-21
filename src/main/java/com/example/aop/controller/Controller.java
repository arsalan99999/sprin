package com.example.aop.controller;

import com.example.aop.service.PaymentService;
import com.example.aop.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class Controller {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String getData(){
//        return "Hello World";
        return paymentService.makePayment();
    }
}
