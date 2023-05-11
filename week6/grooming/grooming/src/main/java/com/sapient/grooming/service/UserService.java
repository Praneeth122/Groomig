package com.sapient.grooming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.grooming.exception.UserNotFoundException;
import com.sapient.grooming.model.User;
import com.sapient.grooming.repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

    @Transactional
	public User saveUser(User user) {
		userRepo.save(user);
		return user;
	}
	
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
	public User getUserByEmail(String email) throws UserNotFoundException {
		Optional<User> user = Optional.ofNullable(userRepo.findByEmail(email));
		return user.orElseThrow(() -> new UserNotFoundException("User with email " +email +" not found"));
	}
	
	public User deleteUser(User user) {
		userRepo.delete(user);
		return user;
	}
}
