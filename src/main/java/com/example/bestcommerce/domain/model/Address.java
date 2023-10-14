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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer id;

    @Column(name = "street", nullable=false)
    private String street;

    @Column(name = "number", nullable=false)
    private Integer number;

    @Column(name = "complement", nullable=true)
    private String complement;

    @Column(name = "city", nullable=false)
    private String city;

    @Column(name = "state", nullable=false)
    private String state;

    @Column(name = "zip_code", nullable=false)
    private String zipCode;
}
