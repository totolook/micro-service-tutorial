package it.totolook.demo.microservice.dto;

import lombok.Builder;
import lombok.Data;

/**
 * UserDTO
 */
@Data
@Builder
public class UserDTO {

    private String name;
    private String surname;
    private String email;
    private String age;

}