package org.scaler.paymentservicejune.Dtos;

import lombok.Data;

@Data
public class paymentRequest {
    private Long orderId;
    private Long amount;
}
