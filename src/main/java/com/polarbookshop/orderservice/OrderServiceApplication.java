package com.polarbookshop.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ConfigurationPropertiesScan
public class OrderServiceApplication {

	@Autowired
	private Environment environment;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderServiceApplication.class, args);
		System.out.println(applicationContext.getBean(OrderServiceApplication.class).environment.getProperty("server.port"));
	}

}
