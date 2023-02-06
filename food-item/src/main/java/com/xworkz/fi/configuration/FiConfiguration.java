package com.xworkz.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan("com.xworkz.fi")
@Configuration
public class FiConfiguration {

	public FiConfiguration() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
}
