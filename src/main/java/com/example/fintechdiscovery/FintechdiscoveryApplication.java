package com.example.fintechdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FintechdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FintechdiscoveryApplication.class, args);
	}

}
