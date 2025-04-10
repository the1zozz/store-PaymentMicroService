package com.store.paymentService.services;

import com.store.paymentService.models.PaymentRequest;
import com.store.paymentService.models.PaymentResponse;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(long orderId);
}
