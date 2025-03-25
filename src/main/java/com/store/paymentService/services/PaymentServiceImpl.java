package com.store.paymentService.services;

import com.store.paymentService.entities.TransactionDetails;
import com.store.paymentService.models.PaymentRequest;
import com.store.paymentService.repository.TransactionsDetailsRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private TransactionsDetailsRepository transactionsDetailsRepository ;

    @Override
    public Long doPayment(PaymentRequest paymentRequest) {
       log.info("recording payment details: {}" , paymentRequest) ;
        TransactionDetails transactionDetails = TransactionDetails.builder()
                .paymentDate(Instant.now())
                .paymentMode(paymentRequest.getPaymentMode().name())
                .paymentStatus("SUCCESS")
                .orderId(paymentRequest.getOrderId())
                .referenceNum(paymentRequest.getReferenceNum())
                .amount(paymentRequest.getAmount())
                .build() ;
        transactionsDetailsRepository.save(transactionDetails) ;
        log.info("payment recorded successfully with transaction id: {}" , transactionDetails.getId()) ;
        return transactionDetails.getId() ;
    }
}
