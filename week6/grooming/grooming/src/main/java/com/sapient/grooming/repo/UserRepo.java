package com.sapient.grooming.repo;

import com.sapient.grooming.model.User;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
