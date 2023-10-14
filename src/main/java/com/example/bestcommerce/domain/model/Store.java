package com.example.bestcommerce.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer id;

    @Column(name = "name", nullable=false)
    private String storeName;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private CustomerType storeAddressId;
}
