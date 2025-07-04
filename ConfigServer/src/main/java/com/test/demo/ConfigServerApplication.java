package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("Config Server is starting1...");
		System.out.println("Config Server is starting2...");
		System.out.println("Config Server is starting22222...");
		System.out.println("Config Server is starting33333...");
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
