package com.apple.fox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoxApplication.class, args);
	}

}