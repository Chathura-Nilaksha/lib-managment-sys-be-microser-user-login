package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Component
public class LoginDto {
    private Long id;
    private String email;
    private String password;

    public LoginDto(String email, String password) {
    }
}
