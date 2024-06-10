package org.scaler.paymentservicejune.service;


import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.scaler.paymentservicejune.paymentGateways.PaymentGateway;
import org.scaler.paymentservicejune.paymentGateways.RazorPayPaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderId, Long amount) throws RazorpayException {

        // call the product service/ order service..
        // get price..
        return paymentGateway.generatePaymentLink(orderId,amount);
    }


}
