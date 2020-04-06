package com.selflearn.paymentservice.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Component
@Entity
@Table(name = "Payment_Tb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private int paymentID;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private int amount;
}
