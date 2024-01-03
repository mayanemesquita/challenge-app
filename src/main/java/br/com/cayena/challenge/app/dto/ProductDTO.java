package br.com.cayena.challenge.app.dto;

import br.com.cayena.challenge.integrations.db.entities.Supplier;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {
    private String id;
    private String name;
    private Integer quantity;
    private BigDecimal unitPrice;
    private Supplier supplier;
}
