package org.scaler.paymentservicejune.paymentGateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, Long amount) throws RazorpayException;
}
