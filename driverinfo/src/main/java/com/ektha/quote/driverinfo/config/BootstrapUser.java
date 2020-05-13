/**
 * 
 */
package com.ektha.quote.driverinfo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.ektha.quote.driverinfo.dao.UserRepository;
import com.ektha.quote.driverinfo.model.Role;
import com.ektha.quote.driverinfo.model.User;

/**
 * @author AsimSubedi
 *
 */
@Component
public class BootstrapUser implements ApplicationListener<ApplicationReadyEvent> {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("==== Verifying if User Exists or not ====");
		createUserWithRole("admin", "admin", "niv@admin.dev", Role.ADMIN);
		
	}

	private void createUserWithRole(String username, String password, String email, Role authority) {
		
		if(userRepository.findByUsername(username) == null) {
			User user = new User(username, new BCryptPasswordEncoder().encode(password), username, username, email, authority, true);
			userRepository.save(user);
			
		}
		
		
	}

}
