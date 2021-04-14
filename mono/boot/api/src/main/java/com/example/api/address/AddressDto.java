package com.example.api.address;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class AddressDto {
    
    private Long addressId;
    private String name;
    private String address;
}
