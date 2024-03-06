package edu.icet.controller;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }
    @GetMapping("/find-by-user-name/{userName}")
    public UserEntity findByUserName(@PathVariable String userName){
        return userRepository.findByUserName(userName);
    }
    @DeleteMapping("/delete/{userName}")
    public ResponseEntity<String> deleteByUserName(@PathVariable String userName){
        return userService.deleteByUserName(userName);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        return userService.deleteById(id);
    }
    @GetMapping("/all-userList")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/is-exist-user/{userName}")
    public boolean isExistUser(@PathVariable String userName){
        return userService.isExistUser(userName);

    }

}
