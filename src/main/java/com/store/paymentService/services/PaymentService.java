package com.store.paymentService.services;

import com.store.paymentService.models.PaymentRequest;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);
}
