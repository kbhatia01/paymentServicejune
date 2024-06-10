package org.scaler.paymentservicejune.controller;


import org.scaler.paymentservicejune.Dtos.paymentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {


    @PostMapping("/")
    public String initiatePayment(@RequestBody paymentRequest request){

        try{

        } catch (Exception e){
            return "ERROR";
        }
        return null;
    }


}
