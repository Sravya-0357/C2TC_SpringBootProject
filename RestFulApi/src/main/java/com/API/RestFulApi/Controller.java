package com.API.RestFulApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hello")
	public String Welcome()
	{
		return "Welcome to the restfull api in spring";
	}
}
