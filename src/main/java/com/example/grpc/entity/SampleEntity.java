package com.example.grpc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "sample_info")
@Builder
@ToString
public class SampleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    public String id;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;


    public String country;

    @Column(name = "created_date", updatable = false)
    public LocalDateTime createdDate;

    @Column(name = "last_modified_date")
    public LocalDateTime lastModifiedDate;

}
