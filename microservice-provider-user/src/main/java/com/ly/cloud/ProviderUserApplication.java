package com.ly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProviderUserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class, args);
	}
	
}
