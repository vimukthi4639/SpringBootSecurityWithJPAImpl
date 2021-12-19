package com.springsecurity.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.app.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	public User findByUserName(String userName);
	
}
