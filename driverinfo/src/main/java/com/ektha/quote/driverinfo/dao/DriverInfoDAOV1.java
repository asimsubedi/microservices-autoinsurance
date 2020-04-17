/**
 * 
 */
package com.ektha.quote.driverinfo.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.ektha.quote.driverinfo.model.Driver;
import com.ektha.quote.driverinfo.model.DrivingHistory;
import com.ektha.quote.driverinfo.model.PrimaryResidency;
import com.ektha.quote.driverinfo.model.ResidencyInfo;

/**
 * @author AsimSubedi
 *
 */
@Repository
public class DriverInfoDAOV1 implements InitializingBean {

	private static List<Driver> driverStore = new ArrayList<Driver>();

	private static final String DATA_FILE_PATH = "datafilepath";

	/**
	 * This method adds DriverInfo to the Driver Store with all properties and auto
	 * generated Id.
	 * 
	 * @param driver
	 * @return Driver object
	 */
	public Driver addDriverInfo(Driver driver) {

		driver.setId(UUID.randomUUID().toString());
		driverStore.add(driver);

		return driver;

	}

	/**
	 * This method fetches Driver info from Driver Store for given Id. If Driver not
	 * found for given Id returns null.
	 * 
	 * @param id
	 * @return Driver Object
	 */
	public Driver fetchDriverInfo(String id) {

		for (int index = 0; index < driverStore.size(); index++) {
			Driver driver = driverStore.get(index);

			if (driver.getId().equals(id))
				return driver;
		}

		return null;
	}

	/**
	 * This method will update the driver Info.
	 * 
	 * @param driver
	 * @return Driver Object with updated info
	 */
	public Driver updateDriverInfo(Driver driver) {

		for (int index = 0; index < driverStore.size(); index++) {
			Driver driverInStore = driverStore.get(index);

			if (driverInStore.getId().equals(driver.getId())) {
				return driverStore.set(index, driver);

			}

		}

		return null;

	}

	/**
	 * This
	 * 
	 * @param id
	 * @return true if deleted successfully
	 */
	public boolean deleteDriverInfo(String id) {

		for (int index = 0; index < driverStore.size(); index++) {
			Driver driver = driverStore.get(index);

			if (driver.getId().equals(id)) {
				driverStore.remove(index);
				return true;
			}
		}

		return false;
	}

	public List<Driver> fetchAllDriverInfo() {

		return driverStore;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		String filePath = System.getProperty(DATA_FILE_PATH);

		System.out.println("== File path" + filePath);

		BufferedReader bfr = new BufferedReader(new FileReader(filePath));

		String line = "";

		while ((line = bfr.readLine()) != null) {

			String[] tokens = line.split(",");
			Driver driver = new Driver();
			driver.setGender(tokens[0]);
			driver.setMaritalStatus(tokens[1]);
			driver.setEducation(tokens[2]);
			driver.setSsn(tokens[3]);

			ResidencyInfo residencyInfo = new ResidencyInfo();
			residencyInfo.setPrimaryResidency(PrimaryResidency.OWN_HOME);
			driver.setResidencyInfo(residencyInfo);

			DrivingHistory drivingHistory = new DrivingHistory();
			drivingHistory.setLicenceStatus(tokens[5]);
			drivingHistory.setYrsLicenced(Integer.parseInt(tokens[6]));
			driver.setDrivingHistory(drivingHistory);

			addDriverInfo(driver);

		}
		bfr.close();

	}

}
