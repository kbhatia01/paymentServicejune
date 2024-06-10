package org.scaler.paymentservicejune.paymentGateways;

import com.razorpay.RazorpayException;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(Long orderId, Long amount) throws RazorpayException {
        // implement stripe here..
        return null;
    }
}
