package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.UserDto;
import com.spring.boot.entities.User;

@Service
public class UserConverter {

	public static User userDtoToUser(UserDto userDto) {
		User user = new User();
		if (userDto != null) {
			user.setId(userDto.getId());
			user.setUserName(userDto.getUserName());
			user.setPassword(userDto.getPassword());
			
			return user;
		}
		return null;
	}

	public static List<UserDto> userToUserDto(List<User> userList) {
		List<UserDto> listUserDto = new ArrayList<>();
		if (userList != null) {
			for (User user : userList) {
				UserDto userDto = new UserDto();
				user.setId(userDto.getId());
				user.setUserName(userDto.getUserName());
				user.setPassword(userDto.getPassword());

				listUserDto.add(userDto);
			}
			return listUserDto;
		}
		return null;
	}
}
