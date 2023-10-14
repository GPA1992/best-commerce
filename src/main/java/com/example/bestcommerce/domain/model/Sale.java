package com.example.bestcommerce.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_store_id", nullable = false)
    private CustomerStore customerStoreId;

    @Column(name = "price", nullable=false)
    private BigDecimal price;

    @Column(name = "tax", nullable=false)
    private BigDecimal tax;

    @Column(name = "sale_date", nullable = false)
    private LocalDateTime saleDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @OneToMany
    @JoinColumn(name = "user_id", nullable = false)
    private List<Product> productId;

}
