package com.virtualpairprogrammers.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PositionTrackerApplication {
	public static void main(String[] args) {
			System.setProperty("server.port", "8080");
	    SpringApplication.run(PositionTrackerApplication.class, args);
	}
}
