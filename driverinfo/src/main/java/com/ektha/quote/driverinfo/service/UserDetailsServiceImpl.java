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
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {

		com.ektha.quote.driverinfo.model.User user = userRepository.findByUsername(username);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();

		grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
		
		System.out.println(user.getPassword() + " is Password");

		return new User(user.getUsername(), user.getPassword(), grantedAuthorities);

	}

}
