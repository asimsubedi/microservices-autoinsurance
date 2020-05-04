/**
 * 
 */
package com.ektha.quote.driverinfo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.quote.driverinfo.exception.DriverInfoNotFoundException;
import com.ektha.quote.driverinfo.model.Driver;
import com.ektha.quote.driverinfo.service.DriverInfoServiceV1;

/**
 * @author AsimSubedi
 *
 */
@RestController
@RequestMapping(value = "api/v1/")
public class DriverInfoControllerV1 {

	@Autowired
	private DriverInfoServiceV1 driverInfoService;

	@PostMapping("driverinfo")
	public Driver addDriverInfo(@RequestBody Driver driver) {
		return driverInfoService.addDriverInfo(driver);
	}

	@GetMapping("driverinfo")
	public List<Driver> fetch() {

		return driverInfoService.fetchAllDriverInfo();
	}

	@GetMapping("driverinfo/{id}")
	public Driver verifyDriverInfo(@PathVariable("id") String id) {

		return driverInfoService.fetchDriverInfo(id).orElseThrow(() -> new DriverInfoNotFoundException());
	}

	/*
	 * @PutMapping("driverinfo") public Driver updateDriverInfo(@RequestBody Driver
	 * driver) { return driverInfoService.updateDriverInfo(driver); }
	 * 
	 * @DeleteMapping("driverinfo/{id}") public boolean
	 * deleteDriverInfo(@PathVariable("id") String id) {
	 * 
	 * return driverInfoService.deleteDriverInfo(id); }
	 */

}
