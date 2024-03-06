package edu.icet.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserDto {
    private Long id;
    private String firstName;
    private String LastName;
    private String userName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String contactNumber;
    private String email;
}
