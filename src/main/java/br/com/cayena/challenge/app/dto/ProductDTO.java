package br.com.cayena.challenge.app.dto;

import br.com.cayena.challenge.integrations.db.entities.Supplier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {
    private String id;
    private String name;
    private Integer quantity;
    private BigDecimal unitPrice;
    private LocalDateTime dateOfCreation;
    private Supplier supplier;
}
