package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    ModelMapper modelMapper;

    @Override
    public ResponseEntity<String> addUser(UserDto userDto) {
        userRepository.save(ModelMapper.map(userDto, UserEntity.class));
        return ResponseEntity.ok("Added the new User");
    }
    @Override
    public ResponseEntity<String> deleteByUserName(String userName) {
        if(userRepository.existsByUserName(userName)) {
            userRepository.deleteByUserName(userName);
            return ResponseEntity.ok("User Deleted");
        }
        return ResponseEntity.ofNullable("Wrong username");

    }
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.ok("User Deleted");
        }
        return ResponseEntity.ofNullable("Wrong id");
    }

    @Override
    public boolean isExistUser(String userName) {
        return (userRepository.existsByUserName(userName));
    }
}
