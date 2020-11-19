package com.appsdevelopr.PhotoApps.Discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppsApiDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppsApiDiscoveryServiceApplication.class, args);
	}

}
