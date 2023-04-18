package org.wits.coindesk.model.dto.entity;

import lombok.Getter;
import lombok.Setter;
import org.wits.coindesk.utils.TimeUtils;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "currency")
@Getter
@Setter
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

    @PrePersist
    public void prePersist() {
        OffsetDateTime now = TimeUtils.getCurrentUTCDateTime();
        this.createdTimestamp = now;
        this.updatedTimestamp = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedTimestamp = TimeUtils.getCurrentUTCDateTime();
    }

}
