package com.example.TravelAgencyServer;

import com.example.TravelAgencyServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelAgencyServerApplication {
	private final UserService userService;

	@Autowired
	public TravelAgencyServerApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TravelAgencyServerApplication.class, args);
	}

}
