package com.springsecurity.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringJpaUserSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaUserSecurityApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//		System.out.println(new BCryptPasswordEncoder().encode("1234"));
		return new BCryptPasswordEncoder();
	}

}
