package br.com.cayena.challenge.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SupplierDTO {
    private String id;
    private String name;
    private LocalDateTime dateOfCreation;
    private LocalDateTime dateOfLastUpdate;
}
