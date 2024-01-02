package br.com.cayena.challenge.integrations.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfLastUpdate;
}
