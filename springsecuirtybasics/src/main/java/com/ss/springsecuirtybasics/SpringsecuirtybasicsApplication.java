package com.ss.springsecuirtybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ss.springsecuirtybasics.controller") // req if controller is outside of this package
public class SpringsecuirtybasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuirtybasicsApplication.class, args);
	}

}
