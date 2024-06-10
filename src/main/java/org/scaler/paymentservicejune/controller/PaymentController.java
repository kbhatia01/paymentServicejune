package org.scaler.paymentservicejune.controller;


import org.scaler.paymentservicejune.Dtos.paymentRequest;
import org.scaler.paymentservicejune.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody paymentRequest request){

        try{
           return this.paymentService.initiatePayment(request.getOrderId(), request.getAmount());
        } catch (Exception e){
            System.out.println("error is"+ e.getMessage());
            return "ERROR";
        }
    }


}
