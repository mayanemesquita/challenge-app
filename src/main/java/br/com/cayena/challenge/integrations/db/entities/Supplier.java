package br.com.cayena.challenge.integrations.db.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    private String id;
    private String name;
    @Column(name = "created_at")
    private LocalDateTime dateOfCreation;
    @Column(name = "update_at")
    private LocalDateTime dateOfLastUpdate;
}
