package com.springdemo.springboot_sample;

import org.springframework.stereotype.Component;

@Component
public class Medicals implements Ordering {

	public void order()
	{
		System.out.println("Ordering Medicines");
	}
}
