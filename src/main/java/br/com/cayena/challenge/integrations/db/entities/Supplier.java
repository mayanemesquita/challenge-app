package br.com.cayena.challenge.integrations.db.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    private String id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfLastUpdate;
}
