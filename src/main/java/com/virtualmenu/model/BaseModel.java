package com.virtualmenu.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @CreatedDate
    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @LastModifiedDate
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
}
