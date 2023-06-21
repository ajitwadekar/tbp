package com.tbp.theatre.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date modified;

    @JsonIgnore
    @Column(columnDefinition = "boolean default false")
    private boolean isDeleted;

    public BaseModel() {
        this.created = new Date();
        this.modified = new Date();
    }

    @PrePersist
    protected void onCreate() {
        this.created = this.modified = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modified = new Date();
    }
}
