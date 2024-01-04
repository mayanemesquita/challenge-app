package br.com.cayena.challenge.app.dto;

import lombok.Getter;

@Getter
public class QuantityControlDTO {
    private String productId;
    private Integer quantity;
    ProductEnum productEnum;
}
