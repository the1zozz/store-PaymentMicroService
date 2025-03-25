package com.store.paymentService.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PaymentRequest {
    private Long orderId ;
    private long amount ;
    private String referenceNum ;
    private PaymentMode paymentMode ;
}
