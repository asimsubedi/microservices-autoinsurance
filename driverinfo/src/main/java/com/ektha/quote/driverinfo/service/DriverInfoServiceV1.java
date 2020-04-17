/**
 * 
 */
package com.ektha.quote.driverinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.quote.driverinfo.dao.DriverInfoDAOV1;
import com.ektha.quote.driverinfo.model.Driver;

/**
 * @author AsimSubedi
 *
 */
@Service
public class DriverInfoServiceV1 {

	@Autowired
	private DriverInfoDAOV1 driverInfoDAO;

	public Driver addDriverInfo(Driver driver) {
		return driverInfoDAO.addDriverInfo(driver);

	}

	public Driver updateDriverInfo(Driver driver) {
		return driverInfoDAO.updateDriverInfo(driver);

	}

	public Driver fetchDriverInfo(String id) {
		return driverInfoDAO.fetchDriverInfo(id);

	}

	public boolean deleteDriverInfo(String id) {
		return driverInfoDAO.deleteDriverInfo(id);

	}

	public List<Driver> fetchAllDriverInfo() {
		return driverInfoDAO.fetchAllDriverInfo();
	}

}
