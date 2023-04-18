package org.wits.coindesk.model.dto.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "currency")
@Data
public class CurrencyEntity {

    @Id
    @Column(name = "oid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    @Column(name = "code")
    private String code;

    @Column(name = "name_cht")
    private String nameCht;

    @Column(name = "created_timestamp")
    private OffsetDateTime createdTimestamp;

    @Column(name = "updated_timestamp")
    private OffsetDateTime updatedTimestamp;

}
