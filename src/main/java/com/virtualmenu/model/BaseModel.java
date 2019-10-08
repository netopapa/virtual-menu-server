package com.virtualmenu.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @CreatedDate
    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @LastModifiedDate
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
}
