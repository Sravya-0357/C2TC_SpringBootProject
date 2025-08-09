package com.springdemo.springboot_sample;

import org.springframework.stereotype.Component;

@Component
public class Grocery implements Ordering {

	public void order()
	{
		System.out.println("Ordering Grocereis");
	}
}
