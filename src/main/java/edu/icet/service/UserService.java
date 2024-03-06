package edu.icet.service;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<String> addUser(UserDto userDto);
    ResponseEntity<String> deleteByUserName(String userName);
    List<UserEntity> getAllUsers();
    ResponseEntity<String> deleteById(Long id);

    boolean isExistUser(String userName);

}
