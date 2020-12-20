package com.calender.CalenderServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CalenderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalenderServerApplication.class, args);
	}

}
