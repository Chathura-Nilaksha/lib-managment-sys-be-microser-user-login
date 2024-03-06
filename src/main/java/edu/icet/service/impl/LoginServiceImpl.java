package edu.icet.service.impl;

import edu.icet.dto.LoginDto;
import edu.icet.entity.LoginEntity;
import edu.icet.repository.LoginRepository;
import edu.icet.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository loginRepository;
    ModelMapper modelMapper;

    @Override
    public void addLoginData(LoginDto loginDto) {
        loginRepository.save(modelMapper.map(loginDto, LoginEntity.class));
    }

    @Override
    public boolean loginValidation(LoginDto loginDto) {
        if(loginRepository.existsByEmail(loginDto.getEmail())) {
            return loginDto.getPassword().equals(loginRepository.findPasswordByEmail(loginDto.getEmail()));
        }
        return false;
    }
}