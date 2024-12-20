package com.kodilla.hibernate.task;

import jakarta.persistence.*;

@Entity
@Table(name = "TASK_FINANCIAL_DETAILS")
public class TaskFinancialDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "PAID")
    private boolean paid;
}
