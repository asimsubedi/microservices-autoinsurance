/**
 * 
 */
package com.ektha.quote.driverinfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.quote.driverinfo.model.User;

/**
 * @author AsimSubedi
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	User save(User user);

}
