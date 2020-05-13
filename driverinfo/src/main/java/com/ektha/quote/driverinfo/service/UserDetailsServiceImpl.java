/**
 * 
 */
package com.ektha.quote.driverinfo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import com.ektha.quote.driverinfo.dao.UserRepository;

/**
 * @author AsimSubedi
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	String ROLE_PREFIX= "ROLE_";

	/*
	 * @Override public User loadUserByUsername(String username) throws
	 * UsernameNotFoundException {
	 * 
	 * com.ektha.quote.driverinfo.model.User user =
	 * userRepository.findByUsername(username);
	 * 
	 * if(user != null) { Set<GrantedAuthority> grantedAuthorities = new
	 * HashSet<GrantedAuthority>();
	 * 
	 * grantedAuthorities.add(new
	 * SimpleGrantedAuthority(user.getRole().toString()));
	 * 
	 * System.out.println(user.getRole() + " is username");
	 * 
	 * return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
	 * 
	 * } else { throw new UsernameNotFoundException("User " + username +
	 * " Not Found!!"); }
	 * 
	 * }
	 */
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		com.ektha.quote.driverinfo.model.User user = userRepository.findByUsername(username);
		
		UserBuilder builder =null;
		
		if(user != null ) {
			builder = User.withUsername(username);
			builder.password(user.getPassword());
			builder.roles(new String[] {user.getRole().toString()});
		} else {
			throw new UsernameNotFoundException("User " + username + " Not Found");
		}
		
		return builder.build();
	}

}
