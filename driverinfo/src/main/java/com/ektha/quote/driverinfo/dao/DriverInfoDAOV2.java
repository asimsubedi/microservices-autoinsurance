package com.ektha.quote.driverinfo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ektha.quote.driverinfo.model.Driver;

/**
 * @author AsimSubedi
 *
 */
public interface DriverInfoDAOV2 extends CrudRepository<Driver, String> {
	
	Optional<Driver> findById(String id);
	
	List<Driver> findAll();

}
