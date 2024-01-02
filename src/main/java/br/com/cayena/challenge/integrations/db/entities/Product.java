package br.com.cayena.challenge.integrations.db.entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "unit_price")
    private double unitPrice;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}