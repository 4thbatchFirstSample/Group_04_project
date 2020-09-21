package com.spring.boot.services;

import java.util.Optional;

import com.spring.boot.entities.User;

public interface UserService {

	public void addUser(User user);

	public String deleteUser(User user);

	public void deleteUserById(Long id);

	public void updateUserById(User user);

	public Optional<User> getUserById(Long id);

}