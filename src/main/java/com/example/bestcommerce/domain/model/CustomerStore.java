package com.example.bestcommerce.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class CustomerStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "customer_id", nullable = false)
    private List<Customer> customerId;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store storeId;

}
