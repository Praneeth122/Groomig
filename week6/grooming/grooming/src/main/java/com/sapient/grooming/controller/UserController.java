package com.sapient.grooming.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.grooming.exception.UserNotFoundException;
import com.sapient.grooming.mapper.UserMapper;
import com.sapient.grooming.model.User;
import com.sapient.grooming.request.UserRequest;
import com.sapient.grooming.response.UserResponse;
import com.sapient.grooming.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("/")
    ResponseEntity<List<UserResponse>> getUsers(){
        List<User> userlist = userService.getAllUser();
        return new ResponseEntity<>(userMapper.userListToUserResponseList(userlist), HttpStatus.OK);
    }
	
	@GetMapping("/{email}")
    ResponseEntity<UserResponse> getUserByEmail(@PathVariable("email") String email) throws UserNotFoundException{
        User user = userService.getUserByEmail(email);
        return new ResponseEntity<>(userMapper.userToUserResponse(user), HttpStatus.OK);
    }
	
    @PostMapping("/save")
    ResponseEntity<UserResponse> addUser(@RequestBody UserRequest request) {
        User user = userService.saveUser(userMapper.userRequestToUser(request));
        return new ResponseEntity<>(userMapper.userToUserResponse(user), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{emial}")
    ResponseEntity<UserResponse> deleteApplicationByEmail(@PathVariable("email") String email) throws UserNotFoundException{
        User user = userService.deleteUser(userService.getUserByEmail(email));
        return new ResponseEntity<>(userMapper.userToUserResponse(user), HttpStatus.OK);
    }

}
