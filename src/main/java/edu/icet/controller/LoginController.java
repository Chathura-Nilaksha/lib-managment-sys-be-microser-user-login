package edu.icet.controller;

import edu.icet.dto.LoginDto;
import edu.icet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login-validation")
    public ResponseEntity<String> loginValidation(@RequestBody LoginDto loginDto){
        return loginService.loginValidation(loginDto) ?
                    ResponseEntity.ok("User validation is successful"):
                    ResponseEntity.ofNullable("User Email is not available in the our system. " +
                            "Please enter a valid Email address");
    }
}
