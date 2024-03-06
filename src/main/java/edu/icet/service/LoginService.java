package edu.icet.service;

import edu.icet.dto.LoginDto;

public interface LoginService {

    void addLoginData(LoginDto loginDto);

    boolean loginValidation(LoginDto loginDto);

}
