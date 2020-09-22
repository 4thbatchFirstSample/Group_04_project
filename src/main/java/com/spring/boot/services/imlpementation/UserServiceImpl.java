package com.spring.boot.services.imlpementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;
import com.spring.boot.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public String deleteUser(User user) {
		userRepository.deleteAll();
		return "Delete Success!!!";
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void updateUserById(User user) {
		userRepository.save(user);
	}

}
