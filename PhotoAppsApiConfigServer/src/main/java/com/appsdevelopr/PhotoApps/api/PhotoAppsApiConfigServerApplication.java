package com.appsdevelopr.PhotoApps.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppsApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppsApiConfigServerApplication.class, args);
	}

}
