package com.freedom.learnKDSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.freedom")
public class LearnKDSBApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnKDSBApplication.class);
	}

}