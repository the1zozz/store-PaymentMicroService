package com.store.paymentService.repository;

import com.store.paymentService.entities.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsDetailsRepository extends JpaRepository<TransactionDetails,Long> {
    TransactionDetails findByOrderId(Long orderId) ;
}
