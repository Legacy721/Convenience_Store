package com.legacy.ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
