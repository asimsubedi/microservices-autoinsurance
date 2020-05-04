/**
 * 
 */
package com.ektha.quote.driverinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.quote.driverinfo.dao.DriverInfoDAOV1;
import com.ektha.quote.driverinfo.dao.DriverInfoDAOV2;
import com.ektha.quote.driverinfo.model.Driver;

/**
 * @author AsimSubedi
 *
 */
@Service
public class DriverInfoServiceV1 {

	@Autowired
	private DriverInfoDAOV2 driverInfoDAO;

	public Driver addDriverInfo(Driver driver) {
		return driverInfoDAO.save(driver);

	}

	/*
	 * public Driver updateDriverInfo(Driver driver) { return
	 * driverInfoDAO.updateDriverInfo(driver);
	 * 
	 * }
	 */

	public Optional<Driver> fetchDriverInfo(String id) {
		return driverInfoDAO.findById(id);

	}

	/*
	 * public boolean deleteDriverInfo(String id) { return
	 * driverInfoDAO.deleteDriverInfo(id);
	 * 
	 * }
	 */

	public List<Driver> fetchAllDriverInfo() {
		return driverInfoDAO.findAll();
	}

}
