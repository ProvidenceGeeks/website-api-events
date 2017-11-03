package com.providencegeeks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventsApi {

	public static void main(String[] args) { SpringApplication.run(EventsApi.class, args); }

	@RequestMapping("/healthcheck")
	public String sayHello()
	{
		return "Hello World !!";
	}
}
