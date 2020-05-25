package com.ektha.quote.driverinfo;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ektha.quote.driverinfo.model.Driver;
import com.ektha.quote.driverinfo.model.DrivingHistory;
import com.ektha.quote.driverinfo.model.ResidencyInfo;

@SpringBootApplication
public class DriverinfoApplication implements CommandLineRunner {
	
	public static final Logger logger = LoggerFactory.getLogger(DriverinfoApplication.class);
	
	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		logger.info("STARTING THE APPLICATION!!");
		
		SpringApplication.run(DriverinfoApplication.class, args);
		
		logger.info("ENDING THE APPLICATION");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Driver driver = new Driver(
				UUID.randomUUID().toString(), 
				"male", "married", "high school", "123456789",
				new ResidencyInfo("OWN_HOME"),
				new DrivingHistory("valid", "5"));
		
		System.out.println("Sending Message ... ");
		
		sender.send(driver);
		
		System.out.println("Message Sent Successfully ...");
		
	}

}
