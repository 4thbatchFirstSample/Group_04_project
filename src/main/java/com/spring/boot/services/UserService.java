package com.spring.boot.services;

import java.util.Optional;

import com.spring.boot.entities.User;

public interface UserService {

	public void addUser(User user);

	public String deleteUser(User user);

	public Optional<User> deleteUserById(Long id);

	public Optional<User> updateUserById(Long id);

}