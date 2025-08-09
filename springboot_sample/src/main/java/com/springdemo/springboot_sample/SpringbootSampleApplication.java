package com.springdemo.springboot_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootSampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringbootSampleApplication.class, args);
		System.out.println("Hello World");
		Customer c= var.getBean(Customer.class);
		c.order();
	
	}

}
