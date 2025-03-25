package com.store.paymentService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Entity
@Table(name = "TRANSACTIONS_DETAILS")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    @Column(name = "ORDER_ID")
    private long orderId ;

    @Column(name = "MODE")
    private String paymentMode ;

    @Column(name = "REFERENCE_NUMBER")
    private String referenceNum ;

    @Column(name = "AMOUNT")
    private long amount ;

    @Column(name = "PAYMENT_DATE")
    private Instant paymentDate ;

    @Column(name = "STATUS")
    private String paymentStatus ;



}
