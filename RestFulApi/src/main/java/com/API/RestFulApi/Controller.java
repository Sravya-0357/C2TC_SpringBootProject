package com.API.RestFulApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	 // To display in web
	@RequestMapping("/hello")
	public String Welcome()
	{
		return "Welcome to the restfull api in spring";
	}
	
	//handling request parameter
	@GetMapping("/heyy")
	public String welcome(@RequestParam(value="name",defaultValue="JavaWorld")String name)
	{
		return "Hello "+name;
	}
	
	//handling the path variables
	@GetMapping("/greet/{name}")
	public String Greet(@PathVariable String name)
	{
		return "Greetings "+name;
	}
}



