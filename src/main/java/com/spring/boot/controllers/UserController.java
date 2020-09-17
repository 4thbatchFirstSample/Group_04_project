package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.UserConverter;
import com.spring.boot.dto.UserDto;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/user")
	public ResponseEntity<Object> addUser(@RequestBody UserDto userDto) {
		userService.addUser(UserConverter.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
}
