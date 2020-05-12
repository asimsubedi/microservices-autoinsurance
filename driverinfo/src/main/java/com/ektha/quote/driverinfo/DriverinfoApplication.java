package com.ektha.quote.driverinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DriverinfoApplication {

	@SuppressWarnings("deprecation")
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	public static void main(String[] args) {
		SpringApplication.run(DriverinfoApplication.class, args);
	}

}
