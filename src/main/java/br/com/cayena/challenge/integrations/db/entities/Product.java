package br.com.cayena.challenge.integrations.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private Integer quantity;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}