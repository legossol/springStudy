package com.example.api.address;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.*;

import lombok.Data;

@Entity
@Data
@Table(name="adres")
public class Address {

    @Id
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    
}
