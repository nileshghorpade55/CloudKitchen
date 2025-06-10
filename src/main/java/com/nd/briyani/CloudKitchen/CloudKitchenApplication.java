package com.nd.briyani.CloudKitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@SpringBootApplication
@EnableWebSecurity
public class CloudKitchenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudKitchenApplication.class, args);
	}

}
