package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroSvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroSvc1Application.class, args);
	}

}
