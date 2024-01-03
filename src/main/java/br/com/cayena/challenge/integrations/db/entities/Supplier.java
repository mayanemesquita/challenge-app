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
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreation;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfLastUpdate;
}
