package com.springsecurity.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.app.repository.UserRepository;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.springsecurity.app.entity.User user = userRepository.findByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		SimpleGrantedAuthority au = new SimpleGrantedAuthority(user.getUserRoll());
		ArrayList<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		simpleGrantedAuthorities.add(au);

		UserDetails userDetails = new User(user.getUserName(), user.getPassword(), simpleGrantedAuthorities);

		return userDetails;
	}

}
