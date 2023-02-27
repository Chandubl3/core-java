package com.xworkz.icecream.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.icecream")
public class IceCreamConfiguration {

	public IceCreamConfiguration() {
		System.out.println("Create "+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver =
				new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
